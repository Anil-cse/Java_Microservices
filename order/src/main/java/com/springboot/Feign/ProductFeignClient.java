package com.springboot.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product" , url = "localhost:8096")
public interface ProductFeignClient {

	@GetMapping(value = "/v1/getProduct")
	public String getProduct();
}
