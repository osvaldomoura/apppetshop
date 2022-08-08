<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppPetShop</title>
</head>
<body>
<div class="container mt-3">
  <h2>AppPetShop</h2>
  <p>Servi�os de petshop</p>
  
  <h3>Classe: Consulta</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>descri��o</td>
        <td>String</td>
        <td>Qual tipo de consulta</td>
      </tr>
      <tr>
        <td>data</td>
        <td>LocalDateTime</td>
        <td>Data da Consulta</td>
      </tr>
      <tr>
        <td>enfermidade</td>
        <td>boolean</td>
        <td>se esta doente</td>
      </tr>
    </tbody>
  </table> <br>
  <h3>Classe: Servi�o</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>nome</td>
        <td>String</td>
        <td>Qual tipo do servi�o</td>
      </tr>
      <tr>
        <td>valor</td>
        <td>float</td>
        <td>Valor do servi�o</td>
      </tr>
      <tr>
        <td>urgente</td>
        <td>boolean</td>
        <td>O servi�o ele tem urg�ncia ?</td>
      </tr>
    </tbody>
  </table> <br>
  <h3>Classe: Cliente</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>nome</td>
        <td>String</td>
        <td>Qual nome do cliente</td>
      </tr>
      <tr>
        <td>cpf</td>
        <td>String</td>
        <td>CPF do cliente</td>
      </tr>
      <tr>
        <td>email</td>
        <td>String</td>
        <td>E-mail</td>
      </tr>
    </tbody>
  </table><br>
  <h3>Classe: Banho</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Completo</td>
        <td>boolean</td>
        <td>Tipo do banho</td>
      </tr>
      <tr>
        <td>porte</td>
        <td>String</td>
        <td>Tamanho do animal</td>
      </tr>
      <tr>
        <td>alergia</td>
        <td>boolean</td>
        <td>Se o animal tem alguma alergia a shampoo</td>
      </tr>
    </tbody>
  </table><br>
  <h3>Classe: Vacina</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>importada</td>
        <td>boolean</td>
        <td>Tipo de vacina</td>
      </tr>
      <tr>
        <td>ultimaVacina</td>
        <td>LocalDateTime</td>
        <td>�ltima vacina tomada</td>
      </tr>
      <tr>
        <td>descri��o</td>
        <td>String</td>
        <td>Descri��o da vacina</td>
      </tr>
    </tbody>
  </table><br>
  <h3>Classe: Exame</h3>
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>Atributo</th>
        <th>Tipo</th>
        <th>Descri��o</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>filhote</td>
        <td>boolean</td>
        <td>porte do animal</td>
      </tr>
      <tr>
        <td>peso</td>
        <td>float</td>
        <td>peso do animal</td>
      </tr>
      <tr>
        <td>medica��o</td>
        <td>String</td>
        <td>descri��o de medicamento</td>
      </tr>
    </tbody>
  </table><br>
</div>
</body>
</html>