package com.usermgt.config;/*
package com.usermgt.config;

import com.usermgt.domain.model.JWTToken;
import com.usermgt.infrastructure.dao.userService;
import com.usermgt.infrastructure.po.UserPO;
import com.usermgt.service.UserService;
import com.usermgt.util.JWTUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

*/
/**
 * @author hao.dai
 * @date 2019/8/18
 *//*

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    @Autowired
    RoleMapper roleMapper;

    */
/**
     * 必须重写此方法，不然会报错
     *//*

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    */
/**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     *//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        String token = (String) authenticationToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        if (username == null || !JWTUtil.verify(token, username)) {
            throw new AuthenticationException("token认证失败！");
        }
        UserPO User = userService.selectByName(username);
        if (User == null) {
            throw new AuthenticationException("该用户不存在！");
        }
        return new SimpleAuthenticationInfo(token, token, "MyRealm");
    }

    */
/**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     *//*

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        UserPO userInfo = (UserPO) principals.getPrimaryPrincipal();
        for (SysRole role : userInfo.getRoleList()) {
            authorizationInfo.addRole(role.getRole());
            for (SysPermission p : role.getPermissions()) {
                authorizationInfo.addStringPermission(p.getPermission());
            }
        }
        return authorizationInfo;
    }
}
*/
