package kr.gracelove.masteringspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/21
 */

@RestController
public class SampleController {

	@GetMapping("/sample")
	public String sample() {
		return "OK";
	}
}
