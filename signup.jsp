<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>

<script>
    function validetor()
    {

   
    var a = document.getElementById('name').value;
    var b = document.getElementById('email').value;
    var d = document.getElementById('password').value;
    var c =  document.getElementById('repassword').value;
    var e = document.getElementById('phone').value;
    var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
    var mo = /^ [0-9]+$/;
    var password = /^[A-Za-z@0-9]+$/;



    if(a==""||b==""||c==""||d==""||e=="")
      {
        alert("all field are required");
        return false;
      }
    else if(!b==emailExp)
      {
        alert("please enter the valid email formate");
        return false;
      }
     else if(e.length<10 || e.length>10)
      {
        alert("please enter the 10 digit mobail number");
        return false;
      }
     else if(d.length<12 )
    	 {
    		 alert("please must 12 cherector");
        	 return false;
        	 
        	 if(d!=password)
        		 {
                   aler("fail");
                   return false;
                  }
    	 }
   
     else if(d!=c)
      {
        alert("please check the password");
        return false;
      }
      else
      {
        return true;
      }

    }
   
</script>

<body>

    <jsp:include page="header.jsp" />

    <div class="card bg-light">
        <article class="card-body mx-auto" style="max-width: 400px;">
            <h4 class="card-title mt-3 text-center">Create Account</h4>
            <p class="text-center">Get started with your free account</p>


            <form onsubmit=" return   validetor()" action="ragister.jsp">

                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-user"></i>
                        </span>
                    </div>
                    <input name="name" class="form-control" placeholder="Full name" type="text" id="name">
                </div>
                <!-- form-group// -->
                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-envelope"></i>
                        </span>
                    </div>
                    <input name="email" class="form-control" placeholder="Email address" type="email" id="email">

                </div>
                <!-- form-group// -->
                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-phone"></i>
                        </span>
                    </div>
                   
                    </select> <input name="phone" class="form-control" placeholder="Phone number" type="text"
                        id="phone">
                </div>
                <!-- form-group// -->
                <!-- <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-building"></i> </span>
		</div>
		<select class="form-control">
			<option selected=""> Select job type</option>
			<option>Designer</option>
			<option>Manager</option>
			<option>Accaunting</option>
		</select>
	</div> form-group end.// -->
                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-lock"></i>
                        </span>
                    </div>
                    <input class="form-control" placeholder="Create password" type="password" name="password"
                        id="password">
                                   
                </div>

                <!-- form-group// -->
                <div class="form-group input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text"> <i class="fa fa-lock"></i>
                        </span>

                    </div>
                    <input name="repassword" class="form-control" placeholder="Repeat password" type="password"
                        id="repassword">
                </div>
                <!-- form-group// -->
                <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">
                        Create Account</button>
                </div>
                <!-- form-group// -->
                <p class="text-center">
                    Have an account? <a href="signin.jsp">Log In</a>
                </p>
            </form>
            <span id="tops"></span>
        </article>
    </div>
    <!-- card.// -->



    <jsp:include page="footer.jsp" />


</body>

</html>