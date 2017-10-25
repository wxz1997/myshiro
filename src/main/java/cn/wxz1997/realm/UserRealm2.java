package cn.wxz1997.realm;

import cn.wxz1997.dao.UserDao;
import cn.wxz1997.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 38078 on 2017/10/23.
 */
public class UserRealm2 extends AuthorizingRealm {
    @Autowired
    private UserDao userDao;

    //token参数就是我们需要认证的token
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("第2个realm：userRealm2");
        SimpleAuthenticationInfo info = null;
        System.out.println("用户输入加密：" + token.getCredentials());
        //1.将token转换为usernamepasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken)token;
        //2.获取用户名
        String username = upToken.getUsername();

        try {
            User user = userDao.selectByUsername(username);
            if(user != null){
                String principal = username;
                String credentials = user.getPassword();
                String realmName = this.getName();

                //salt盐值类型：ByteSource,盐值为username
                ByteSource salt = ByteSource.Util.bytes(username);

                SimpleHash sh = new SimpleHash("MD5", credentials, salt, 1024);

                //System.out.println("数据库密码加密：" + sh);
                info = new SimpleAuthenticationInfo(principal, sh, salt, realmName);
            }else{
                throw new AuthenticationException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return info;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //返回值为用户对应的所有角色
        //参数：登录的身份，用户名
        SimpleAuthorizationInfo info = null;
        String username = principals.toString();
        User user = userDao.selectByUsername(username);
        if(user != null){
            Set<String> roles = new HashSet<String>();
            roles.add(user.getRole());
            System.out.println("角色：" + roles);
            info = new SimpleAuthorizationInfo(roles);
        }else{
            throw new AuthenticationException();
        }

        return info;
    }
}
