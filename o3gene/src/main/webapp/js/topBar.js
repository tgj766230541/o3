$(function(){
	/*普通nav条目，悬停时收/缩*/
	$('.nav-item').hover(function() {
		$(this).children('ul').attr('z-index', 99);
		$(this).children('ul').stop(true, true).slideDown(300);
	}, function() {
		$(this).children('ul').removeAttr('z-index');
		$(this).children('ul').stop(true, true).slideUp(300);
	});
})