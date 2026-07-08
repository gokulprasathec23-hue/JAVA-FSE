const form=document.getElementById("studentForm");
form.addEventListener("submit",function(e){
    e.preventDefault();
    const student={
        name:document.getElementById("name").value,
        regno:document.getElementById("regno").value,
        collage:document.getElementById("collage").value
    };
    fetch("http://localhost:8080/students/details/add",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(student)
    })
    .then(response=>{
        if(response.ok){
            document.getElementById("message").style.color="green";
            document.getElementById("message").innerHTML="Student Registered Successfully";
            form.reset();
        }
        else{
            document.getElementById("message").style.color="red";
            document.getElementById("message").innerHTML="Registration Failed";
        }
    })
    .catch(error=>{
        console.log(error);
        document.getElementById("message").style.color="red";
        document.getElementById("message").innerHTML="Server Error";
    });
});