<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty operation }"><p>Résultat de l'opération ${nombre1} ${operation} ${nombre2} = <strong>${resultat}</strong></p></c:if>
<form method="post" action="/JavaEECalculatrice/Calculatrice/">
   <p>
   	<input type="number" name="nombre1" id="nombre1" required />
   	<select name="operation" id="operation" required>
           <option value="+">+</option>
           <option value="-">-</option>
           <option value="*">*</option>
           <option value="/">/</option>
       </select>
   	<input type="number" name="nombre2" id="nombre2" required />
   	<input type="submit" value="Envoyer" />
   </p>
</form>
</body>
</html>