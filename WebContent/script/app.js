//get the add button value to 
let addBlog=document.getElementById("addBlog");
const myForm = document.getElementById("form");
let postButton = document.getElementById("post");
let selectedAnswers =  document.getElementById("answers");
let edit = document.getElementById("edit");
let delet = document.getElementById("delete");
let blogTitle = document.getElementById("blog-title");
//var ans1={};
let blogDescription = document.getElementById("blog-description");
	console.log(blogTitle);
	console.log(blogDescription);

addBlog.onclick = () =>{
	console.log("onclick");
	document.getElementById('popup').style.display = "block";
} 
edit.onclick = () =>{
	document.getElementById('popup').style.display = "block";
}
/*delet.onclick = () =>{
	document.getElementById('popup').style.display = "block";
	delete ans1[document.getElementById("title").value];
	selectedAnswers.value=ans;
	console.log(selectedAnswers);
	console.log(selectedAnswers.value);
	myForm.submit();
}*/
//Function to Hide Popup
function div_hide(){
	document.getElementById('popup').style.display = "none";
}

//When submit button is clicked store the text field value to a hidden value and post the form data to server
postButton.onclick = ()=>{
	var ans=[];
	let title=document.getElementById("title").value;
	ans.add(title);
	let message=document.getElementById("msg").value;
	ans.add(message);
	console.log(ans);
	selectedAnswers.value=ans;
	console.log(selectedAnswers);
	console.log(selectedAnswers.value);

	myForm.submit();
}
