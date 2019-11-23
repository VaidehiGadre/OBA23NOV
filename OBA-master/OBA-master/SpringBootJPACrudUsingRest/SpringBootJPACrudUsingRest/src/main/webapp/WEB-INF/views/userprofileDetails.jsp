<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<body>

<script type="text/javascript">
    function AadharValidate() {
        var aadhar = document.getElementById("txtAadhar").value;
        var adharcardTwelveDigit = /^\d{12}$/;
        var adharSixteenDigit = /^\d{16}$/;
        if (aadhar != '') {
            if (aadhar.match(adharcardTwelveDigit)) {
                return true;
            }
            else if (aadhar.match(adharSixteenDigit)) {
                return true;
            }
            else {
                alert("Enter valid Aadhar Number");
                return false;
            }
        }
        
    }
    function mobValidate()
    {
    var a = document.frm.mobile_no.value;
    if(a=="")
    {
    alert("please Enter the Contact Number");
    document.frm.mobile_no.value;
    return false;
    }
    if(isNaN(a))
    {
    alert("Enter the valid Mobile Number(Like : 9566137117)");
    document.frm.mobile_no.value;
    return false;
    }
 
    }
    
    
    function ValidateEmail()
    {
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var email = document.frm.email_id.value;
    if(email.match(mailformat))
    {
    return true;
    }
    else
    {
    alert("You have entered an invalid email address!");
    return false;
    }
    }

    
    function ValidateFname()
    { 
    var letters = /^[A-Za-z]+$/;
    var fname = document.frm.f_name.value;

    if(fname.match(letters))
    {
    return true;
    }
    else
    {
    alert('First name must have alphabet characters only');
    fname.focus();
    return false;
    }
    }
    
    
    function ValidateLname()
    { 
    var letters = /^[A-Za-z]+$/;
    var lname = document.frm.l_name.value;

    if(lname.match(letters))
    {
    return true;
    }
    else
    {
    alert('Last name must have alphabet characters only');
    lname.focus();
    return false;
    }
    }
    
    
    function ValidateMname()
    { 
    var letters = /^[A-Za-z]+$/;
    var mname = document.frm.m_name.value;

    if(mname.match(letters))
    {
    return true;
    }
    else
    {
    alert('Middle name must have alphabet characters only');
    mname.focus();
    return false;
    }
    }
    
    
    function ValidateFathers_name()
    { 
    var letters = /^[A-Za-z]+$/;
    var fathername = document.frm.fathers_name.value;

    if(fathername.match(letters))
    {
    return true;
    }
    else
    {
    alert('father name must have alphabet characters only');
    fathername.focus();
    return false;
    }
    }
    
    
    function ValidateResAddress()
    { 
    var letters = /^[0-9a-zA-Z]+$/;
    var resaddr = document.frm.res_addr.value;

    if(resaddr.match(letters))
    {
    return true;
    }
    else
    {
    alert('Residential address must have alphanumeric characters only');
    uadd.focus();
    return false;
    }
    }
    
    
    function ValidatePerAddress()
    { 
    var letters = /^[0-9a-zA-Z]+$/;
    var peraddr = document.frm.per_addr.value;

    if(peraddr.match(letters))
    {
    return true;
    }
    else
    {
    alert('Permanent address must have alphanumeric characters only');
    uadd.focus();
    return false;
    }
    }
    
   
</script>

	<div style="margin: 50px">
		<h1>User Profile Info</h1>

		<form name ="frm" method="get" action="userprofileprocess">

<!-- 			<span>Aadhar No.:</span> <input type="text" name="aadhar_no" required />-->	
       		<span>Aadhar No.:</span><input type="text" id="txtAadhar" name="aadhar_no" onblur="AadharValidate();"/>
			

			<span> First Name: </span> <input type="text" name="f_name" required onblur="ValidateFname();" />

			<span> Last Name: </span> <input type="text" name="l_name" required onblur="ValidateLname();"/>
	</div>

	<span> Middle Name: </span>

	<input type="text" name="m_name" onblur="ValidateMname();"/>

	</div>
	<span> Father's Name: </span>

	<input type="text" name="fathers_name" onblur="ValidateFathers_name();"/>

	</div>
	<span> Mobile No.: </span>

	<input type="text" id="txtMob" name="mobile_no" minlength="10" maxlength="10" title="Mobile number should contain 10 digits" required onblur="mobValidate();"/>

	</div>
	<span> Email Id: </span>

	<input type="text" name="email_id"  required onblur="ValidateEmail();"/>

	</div>

	<span> Date of Birth: </span>

	<input type="date" name="dob" required />

	</div>

	<span> Residential Address: </span>

	<input type="text" name="res_addr" required onblur="ValidateResAddress();"/>

	</div>
	<span> Permanent Address: </span>

	<input type="text" name="per_addr" required onblur="ValidatePerAddress();" />

	</div>
	<span> Occupational Details(Service/Business): </span>

	<input type="text" name="occ_details" required />

	<input type="submit" value="Create Account" />

	</form>

	</div>

</body>
</html>










