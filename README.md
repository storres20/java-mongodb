<div align="center">

  <img src="https://user-images.githubusercontent.com/81504385/235504223-4b2fb1bb-d459-4698-8e38-ab3b3a78443f.png" alt="logo" height="auto" />
  <br/>

  <h1><b>Tutorial Java - MongoDB</b></h1>

</div>

## Objetivo:

Permitir la conexion a la base de datos en MONGODB usando el lenguaje de programacion JAVA.

## MongoDB

Es una Base de Datos NO-RELACIONAL. Permite alojamiento de datos en la nube de forma GRATUITA y hasta 500 CONEXIONES SIMULTANEAS.

## Crear cuenta en MONGODB

`Paso 1:` Ingresar a pagina web

Para ello ingresaremos a la pagina web de MONGODB por medio del siguiente enlace: `https://www.mongodb.com/`

![image](https://user-images.githubusercontent.com/81504385/235505997-12f7b450-3a6f-4625-9263-ee7b409e16a2.png)

Paso 2: Click en boton "Try free"

Se visualizará la siguiente pagina

![image](https://user-images.githubusercontent.com/81504385/235506315-f368c077-1da2-4f83-bf0c-444046fa14c0.png)

Hay 02 alternativas para crear el usuario (Paso 3.1 y Paso 3.2). Queda en usted escoger la opcion.
Por practicidad, estoy optando por el Paso 3.2

Paso 3.1: Completar el formulario

Completar la informacion solicitada para crear el usuario (First Name, Last Name, Company, Email, Password).

Marcar el checkbox de "I agree with the Terms of Service and Privacy Policy"

Click en el boton de color verde "Create your Atlas account"

Paso 3.2: Click en boton "Sign up with Google"

Paso 4: Continuar

Click en checkbox "I accept the Privacy Policy and the Terms of Service"

Click en boton "Submit"

![image](https://user-images.githubusercontent.com/81504385/235507434-5d85c085-bf56-430a-80ec-26df35fc3321.png)

Paso 5: Completar la informacion solicitada

En la imagen adjunta se aprecia una alternativa para completar con la informacion solicitada

What is your goal today?
Respuesta: "Build a new application"

What type of application are you building?
Respuesta: "Inventory or Product Catalog"

What is your preferred language?
Respuesta: "Java"

Finalmente, click en boton de color verde "Finish"

![image](https://user-images.githubusercontent.com/81504385/235507870-4ee06655-5a35-474d-a311-be50c0562cef.png)

Paso 6: Configuracion basica

Seleccionar "M0 Free", la cual es la capa gratuita de MONGODB y la utilizaremos en el presente proyecto

No cambiar el resto de opciones (Provider: AWS / Region: N. Virginia(us-east-1) / Name: Cluster0)

Finalmente, click en boton de color verde "Create"

![image](https://user-images.githubusercontent.com/81504385/235508495-877a692a-3b91-40cb-9870-958889004d69.png)

![image](https://user-images.githubusercontent.com/81504385/235508978-c5b585fe-cd2c-4090-b4b9-b7d726a4733c.png)

Paso 7: Generar USUARIO y CONTRASEÑA

1. El USUARIO o USERNAME debe ser ingresado manualmente

2. La CONTRASEÑA o PASSWORD puede ser ingresado manualmente o tambien, puede ser AUTOGENERADO por medio del boton "Autogenerate Secure Password"
Por fines practicos de este tutorial, se esta AUTOGENERANDO la contraseña por medio del boton mencionado

NOTA: Almacenar la CONTRASEÑA en un documento de texto u otro lugar, de modo que pueda ser consultado.
Este valor sera introducido en el codigo para establecer la conexion con la Base de Datos en MONGODB

3. Finalmente, click en el boton de color verde "Create User"

![image](https://user-images.githubusercontent.com/81504385/235510404-d240430f-a491-4210-96e7-2423fda5ec75.png)

A continuacion se visualizara lo siguiente:

![image](https://user-images.githubusercontent.com/81504385/235511279-b3934e24-05ab-41a4-83a0-07ecaabfa278.png)

Paso 8: Configurar la IP ACCESS LIST

MONGODB de manera automatica ha agregado la IP address asignada a la PC.
MONGODB solo permitira accesos a la base de datos UNICAMENTE desde dicha IP address.
Esto es una limitante si es que se desea acceder a la lectura de los datos desde diferentes dispositivos (celular, laptop) y/o desde diferentes ubicaciones y/o IP address

Para ello, primero REMOVEMOS la IP address asignada. Asi que damos click en el boton "REMOVE"

Luego, en el INPUT de IP ADDRESS ingresamos el siguiente valor: 0.0.0.0/0
Esto permitira el acceso y/o lectura de la base de datos desde cualquier dispositivo

Finalmente, click en el boton "Add Entry"

![image](https://user-images.githubusercontent.com/81504385/235512596-b8f4bcd4-df8d-4749-bf7a-8346f4da1695.png)

![image](https://user-images.githubusercontent.com/81504385/235512775-4b81052e-258d-4604-a7b7-c761a2e3260d.png)

Finalmente, click en el boton de color verde "Finish and Close"

![image](https://user-images.githubusercontent.com/81504385/235512957-58f38dcb-3efb-4f81-be2b-a4dfdfb06451.png)

Paso 9: Click en boton "Go to Databases"

![image](https://user-images.githubusercontent.com/81504385/235513146-2444d725-b8fb-4549-9b32-edf6d42348cb.png)

Paso 10: Retorno a pagina principal del Dashboard

![image](https://user-images.githubusercontent.com/81504385/235513697-0b02e67a-46dd-4820-a1a6-5b82f1ee73b4.png)




