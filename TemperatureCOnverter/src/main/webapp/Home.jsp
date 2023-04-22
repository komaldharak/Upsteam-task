<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;   charset=UTF-8">
<title>Temperature Converter</title>
</head>
<style>
	body {
    font-family: Arial, sans-serif;
    margin: 0;
        background-image:url("https://images.pexels.com/photos/1353938/pexels-photo-1353938.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
    
  }
  
  h1 {
    text-align: center;
  }
  
  .container {
    max-width: 500px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }
  
  form {
    display: flex;
    flex-direction: column;
    font-size:25px
    
  }
  
  label {
    margin-bottom: 10px;
  }
  
  input[type="number"],
  select {
  height:8px;
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
  }
  
  .submit {
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }
  
  #result {
    font-size: 24px;
    font-weight: bold;
    margin-top: 20px;
  }
  
</style>
<link rel="stylesheet" href="style.css">
<body>
	<h1>Temperature Converter</h1>
    <div class="container">
      <form method="get"  action="TempConvert" >
        <label for="inputTemp">Temperature:</label>
        <input type="number" id="inputTemp" name="inputTemp" required>
        <select id="inputScale" name="inputScale">
          <option value="celsius">Celsius</option>
          <option value="fahrenheit">Fahrenheit</option>
          <option value="kelvin">Kelvin</option>
        </select><br>

        <label for="outputScale">Convert to:</label>
        <select id="outputScale" name="outputScale">
          <option value="celsius">Celsius</option>
          <option value="fahrenheit">Fahrenheit</option>
          <option value="kelvin">Kelvin</option>
        </select><br>

        <button type="Submit" class="submit" >Convert</button>
      </form>

      <div id="result"></div>
    </div>
</body>
</html>