$(function(){
	//修改img的src
	$(".changeImg").click(function() {
		$("#imgObj").attr("src", $.chgUrl($("#imgObj").attr("src")));
	})

	// 时间戳,为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
	$.chgUrl = function(url) {
		var timestamp = (new Date()).valueOf();
		url = url.substring(0, 28);
		if ((url.indexOf("&") >= 0)) {
			url = url + "×tamp=" + timestamp;
		} else {
			url = url + "?timestamp=" + timestamp;
		}
		return url;
	}
})
