package org.wangke.api.security.customer;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义安全认证，本次测试一个简单的自定义安全认证
 * 验证 /api/test 请求头上必须带有 customer 字段，并带有用户名和密码，验证成功后给用户返回权限
 */
public class CustomerFilter extends AbstractAuthenticationProcessingFilter {

    protected CustomerFilter(String defaultFilterProcessesUrl) {
        super(defaultFilterProcessesUrl);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        return null;
    }
}
