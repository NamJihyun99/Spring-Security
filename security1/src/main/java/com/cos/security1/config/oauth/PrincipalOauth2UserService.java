package com.cos.security1.config.oauth;


import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {

    // 구글로부터 받은 userRequest 데이터에 대한 후처리를 해주는 함수
    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        System.out.println("userRequest.clientRegistration = " + userRequest.getClientRegistration());
        System.out.println("userRequest.accessToken = " + userRequest.getAccessToken().getTokenValue());
        System.out.println("attribute = " + super.loadUser(userRequest).getAttributes());
        return super.loadUser(userRequest);

        /**
         * username = google_{sub}
         * password = "암호화(특정문자열)"
         * email = 구글 이메일
         * role = "ROLE_USER"
         * provider = "google"
         * providerId = {sub}
         * */
    }
}
