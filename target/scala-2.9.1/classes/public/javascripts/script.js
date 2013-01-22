$(document).ready(function(){	
	
   
	handleFiles = function (files,e){
		// alert(files);
		// Traverse throught all files and check if uploaded file type is image	
		var imageType = /image.*/;  
		var file = files[0];
		// check file type
		
		
		var info = '<div class="preview active-win"><div class="preview-image"><img ></div><div class="progress-holder"><span id="progress"></span></div><span class="percents"></span><div style="float:left;">Uploaded <span class="up-done"></span> KB of '+parseInt(file.size / 1024)+' KB</div>';
		
		$(".upload-progress").show("fast",function(){
			$(".upload-progress").html(info); 
			uploadFile(file);
		});
		
  }

  uploadFile = function(file){
	// check if browser supports file reader object 
	if (typeof FileReader !== "undefined"){
	//alert("uploading "+file.name);  
	reader = new FileReader();
	reader.onload = function(e){
		//alert(e.target.result);
		$('.preview img').attr('src',e.target.result).css("width","70px").css("height","70px");
	}
	reader.readAsDataURL(file);

	xhr = new XMLHttpRequest();
	xhr.open("get", "demoHit", true);

	xhr.upload.addEventListener("progress", function (event) {
		console.log(event);
		if (event.lengthComputable) {
			$("#progress").css("width",(event.loaded / event.total) * 100 + "%");
			$(".percents").html(" "+((event.loaded / event.total) * 100).toFixed() + "%");
			$(".up-done").html((parseInt(event.loaded / 1024)).toFixed(0));
		}
		else {
			alert("Failed to compute file upload length");
		}
	}, false);

	xhr.onreadystatechange = function (oEvent) {  
	  if (xhr.readyState === 4) {  
		if (xhr.status === 200) {  
		  $("#progress").css("width","100%");
		  $(".percents").html("100%");
		  $(".up-done").html((parseInt(file.size / 1024)).toFixed(0));
		} else {  
		  alert("Error"+ xhr.statusText);  
		}  
	  }  
	};  
	
	// Set headers
	xhr.setRequestHeader("Content-Type", "multipart/form-data");
	xhr.setRequestHeader("X-File-Name", file.fileName);
	xhr.setRequestHeader("X-File-Size", file.fileSize);
	xhr.setRequestHeader("X-File-Type", file.type);

	// Send the file (doh)
	xhr.send(file);

	}else{
		alert("Your browser doesnt support FileReader object");
	} 		
  }
});