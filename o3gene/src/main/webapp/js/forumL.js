$(function(){
	$(".forumL li").mouseenter(function(){
		$(this).find(".fa-thumbs-up").css("color","#8ED14C")
	});
	$(".forumL li").mouseleave(function(){
		$(this).find(".fa-thumbs-up").css("color","#CCC")
	});
})