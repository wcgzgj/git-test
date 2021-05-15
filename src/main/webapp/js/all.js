// //文档确认加载
// 		$(function() {
// 			$("input[name='userName']").blur(function(){
// 					isUserName();
// 				});
//
// 				$("input[name='pwd1']").blur(function(){
// 					isPwd();
// 				});
//
// 				$("input[name='pwd2']").blur(function(){
// 					isPwd2();
// 				});
//
// 				$("input[name='phone']").blur(function(){
// 					isTelCode();
// 				});
//
// 				$("input[name='email']").blur(function(){
// 					IsEmail();
// 				});
//
// 				// 只有符合以上全部验证要求,才会去提交表单
// 				$("#myForm").submit(function(){
// 					return isUserName()&&isPwd()&&isPwd2()&&isTelCode()&&IsEmail();
// 				});
// 		});
//
// 		function isUserName(){
// 			var val=$("input[name='userName']").val();
// 				if(val==""){
// 					$("span[id='userNameMsg']").html("用户名不能为空！").css("color","red");
// 					return false;
// 				} else if (/^[a-zA-z]\w{5,}/.test(val)==false){
// 					$("span[id='userNameMsg']").html("用户名不合法！").css("color","red");
// 					return false;
// 				}
// 				$("span[id='userNameMsg']").html("用户名可用！").css("color","green");
// 			return true;
// 		}
//
// 		function isPwd(){
// 			var val=$("input[name='pwd1']").val();
// 				if(val==""){
// 					$("span[id='pwd1Msg']").html("密码不能为空！").css("color","red");
// 					return false;
// 				}else if(val.length<8){
// 					$("span[id='pwd1Msg']").html("密码长度不合法！").css("color","red");
// 					return false;
// 				}
// 				$("span[id='pwd1Msg']").html("密码格式正确！").css("color","green");
// 				return true;
// 		}
//
// 		function isPwd2(){
// 			if($("input[name='pwd1']").val()!=$("input[name='pwd2']").val()){
// 					$("span[id='pwd2Msg']").html("两次密码不一致！").css("color","red");
// 					return false;
// 				}
// 				$("span[id='pwd2Msg']").html("OK！").css("color","green");
// 				return true;
// 		}
//
// 		/*校验电话码格式-座机或者手机 */
// 		function isTelCode() {
// 			var str = $("input[name='phone']").val();
// 			var reg = /^1[0-9]{10}/;
// 			if(reg.test(str)){
// 				$("span[id='phoneMsg']").html("OK！").css("color","green");
// 				return true;
// 			}
// 			$("span[id='phoneMsg']").html("电话格式不合法！").css("color","red");
// 			return false;
// 		}
//
// 		/*校验邮件地址是否合法 */
// 		function IsEmail() {
// 			var str = $("input[name='email']").val();
// 			var reg = /^[A-Za-z0-9]+([_\.][A-Za-z0-9]+)*@([A-Za-z0-9\-]+\.)+[A-Za-z]{2,6}$/;
// 			if(reg.test(str)){
// 				$("span[id='emailMsg']").html("OK！").css("color","green");
// 				return true;
// 			}
// 			$("span[id='emailMsg']").html("邮箱地址不合法！").css("color","red");
// 			return false;
// 		}