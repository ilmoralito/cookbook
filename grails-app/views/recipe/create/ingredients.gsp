<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Agrega ingredientes</title>
	<meta name="layout" content="list">
	<r:require modules="bootstrap,application"/>
</head>
<body>
	<g:hasErrors bean="${ingredient}">
		<g:renderErrors bean="${ingredient}"/>
	</g:hasErrors>

	<g:form>
		<div class="form-group">
			<label for="mAndQ">Media y cantidad</label>
			<g:textField name="mAndQ" value="${ingredient?.mAndQ}" class="form-control" autofocus="true"/>
		</div>

		<div class="form-group">
			<label for="name">Ingrediente</label>
			<g:textField name="name" value="${ingredient?.name}" class="form-control"/>
		</div>

		<g:submitButton name="addIngredient" value="Crear receta" class="btn btn-primary"/>
		<g:submitButton name="deleteRecipe" value="Cancelar" class="btn btn-primary"/>
	</g:form>

	<g:if test="${ingredients}">
		<table class="table">
			<thead>
				<th>Medida</th>
				<th>Ingrediente</th>
				<th></th>
			</thead>
			<tbody>
				<g:each in="${ingredients}" var="ingredient">
					<tr>
						<td>${ingredient.mAndQ}</td>
						<td>${ingredient.name}</td>
						<td><g:link event="deleteIngredient" id="${ingredient.id}">Delete</g:link></td>
					</tr>
				</g:each>
			</tbody>
		</table>
	</g:if>
</body>
</html>