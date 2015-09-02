package com.avicit.framework.util.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.avicit.framework.util.DproMessageConsts;
import com.avicit.onlinemusic.vo.UserVo;

/**
 * [功能]实现用户登录前段验证
 * @author mac
 *
 */
public class UserLoginValidator implements Validator{

	public UserLoginValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// supports(Class)：表示这个Validator是否支持该Class的实例？
		return UserVo.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		/*validate(Object, org.springframework.validation.Errors)：对提供的对象进行校验，并将校验的错误注册到传入的Errors 对象中。
                              实现一个Validator也比较简单，尤其是当你学会了Spring所提供的ValidationUtils以后。我们一起来看一下如何才能创建一个校验器。
		 */

		UserVo uservo=(UserVo)target;

		// 使用了ValidationUtils中的一个静态方法rejectIfEmpty(..)来对name属性进行校验，假若'name'属性是 null 或者空字符串的话，就拒绝验证通过 。
		ValidationUtils.rejectIfEmpty(errors, "name", DproMessageConsts.VALID_USER_ALL);
		ValidationUtils.rejectIfEmpty(errors, "pwd", DproMessageConsts.VALID_USER_ALL);
		


	}

}
