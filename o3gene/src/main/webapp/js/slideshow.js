$(function(){
	setImgHeight();
	$(window).resize(function(){
		setImgHeight();
	})
})

/*修改轮播图图片的高度*/
function setImgHeight(){
	$("#myCarousel").css("height",$("#myCarousel").width()/4);
}