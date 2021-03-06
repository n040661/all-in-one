package com.aaron.springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 基于Feign的http服务申明
 *
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2018/5/24
 */
@FeignClient ("spring-cloud-service-provider/provider")
public interface UserServiceFacade
{
    @RequestMapping (value = "/user/{userId}", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    Student queryUserInfo(@RequestBody Student student, @PathVariable ("userId") Long userId);
}
