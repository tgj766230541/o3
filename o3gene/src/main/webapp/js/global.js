$(function(){
	$(".autoImg").each(function(){
		var width=$(this).width();
		var height=$(this).height();
		var pwidth=$(this).parent().width();
		var pheight=$(this).parent().height();
		$(this).parent().css("overflow","hidden");
		if(width/height>=pwidth/pheight){
			$(this).css("height","100%");
			width=$(this).width();
			$(this).css("left",-(width-pwidth)/2);
		}else{
			$(this).css("width","100%");
			height=$(this).height();
			$(this).css("top",-(height-pheight)/2);
		}
	})
})