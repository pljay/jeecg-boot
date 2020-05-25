package org.jeecg.modules.system.controller;


import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.modules.system.entity.SysDict;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * lodop 打印配置信息
 * </p>
 *
 * @Author zhangweijian
 * @since 2018-12-28
 */
@RestController
@RequestMapping("/sys/lodop")
@Slf4j
public class SysLodopController {
	/**
	 * Lodop settings
	 */
	@Value("${lodop.cp}")
	private String cp;
	@Value("${lodop.key}")
	private String key;
	@Value("${lodop.toCp}")
	private String toCp;
	@Value("${lodop.token}")
	private String token;
	@Value("${lodop.HKtoCp}")
	private String HKtoCp;
	@Value("${lodop.HKtoken}")
	private String HKtoken;


	@RequestMapping(value = "/queryToken", method = RequestMethod.GET)
	public Result<?> queryToken() {
	    log.info(this.cp);
        log.info(this.key);
		Map<String, Object> lodop = new HashMap<>();
		RSA rsa = new RSA();
		lodop.put("cp",rsa.encryptBase64(this.cp, KeyType.PublicKey));
		lodop.put("key",rsa.encryptBase64(this.key, KeyType.PublicKey));
		lodop.put("toCp",rsa.encryptBase64(this.toCp, KeyType.PublicKey));
		lodop.put("token",rsa.encryptBase64(this.token, KeyType.PublicKey));
		lodop.put("HKtoCp",rsa.encryptBase64(this.HKtoCp, KeyType.PublicKey));
		lodop.put("HKtoken",rsa.encryptBase64(this.HKtoken, KeyType.PublicKey));
		lodop.put("privateKey",rsa.getPrivateKeyBase64());
		return Result.ok(lodop);
	}


}
