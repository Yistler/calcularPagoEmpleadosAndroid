# **Cálculo de Pagos Líquidos - Android App**

## Descripción del Proyecto

Esta aplicación Android permite calcular los pagos líquidos de los trabajadores, diferenciando entre empleados a honorarios y empleados con contrato. La aplicación cuenta con tres pantallas principales:

1. **Pantalla Principal**: Menú de navegación que permite acceder a las pantallas de cálculo.
2. **Pantalla de Cálculo de Honorarios**: Pantalla para calcular los pagos líquidos de empleados a honorarios (con retención del 13%).
3. **Pantalla de Cálculo de Empleados con Contrato**: Pantalla para calcular los pagos líquidos de empleados con contrato (con retención del 20%).

### Características Principales:
- **Cálculo de pagos líquidos**: La aplicación permite al usuario ingresar los valores brutos de los trabajadores y calcular el monto líquido a pagar, considerando las tasas de retención de 13% para honorarios y 20% para empleados con contrato.
- **Interfaz de usuario**:
  - **Pantalla principal** con botones de navegación.
  - **Pantalla de honorarios** utilizando **Jetpack Compose**.
  - **Pantalla de empleados con contrato** utilizando **Vistas XML**.
  - **Botones de navegación** para volver a la pantalla principal en cada pantalla de cálculo.

---

## Requisitos

Para ejecutar este proyecto, necesitas:

- **Android Studio**: La última versión de Android Studio instalada.
- **JDK**: Java Development Kit versión 8 o superior.

---


## Funcionamiento de la Aplicación

### Pantalla Principal (`MainActivity`):
En esta pantalla, el usuario puede seleccionar entre las siguientes opciones:
- **Cálculo de Honorarios**
- **Cálculo de Empleados con Contrato**

Al seleccionar una de las opciones, el usuario es llevado a la pantalla correspondiente para ingresar los datos.

### Pantalla de Cálculo de Honorarios:
Esta pantalla permite ingresar el monto bruto de un empleado a honorarios. Se calcula el pago líquido aplicando una retención del 13%. El resultado se muestra al usuario.

- **Entrada**: Monto bruto (número decimal).
- **Cálculo**: Pago líquido = Monto bruto - (Monto bruto * 13%).
- **Botón de regreso**: Permite volver a la pantalla principal.

### Pantalla de Cálculo de Empleados con Contrato:
Esta pantalla permite ingresar el monto bruto de un empleado con contrato. Se calcula el pago líquido aplicando una retención del 20%. El resultado se muestra al usuario.

- **Entrada**: Monto bruto (número decimal).
- **Cálculo**: Pago líquido = Monto bruto - (Monto bruto * 20%).
- **Botón de regreso**: Permite volver a la pantalla principal.

---


## Implementación

### Cálculo de Pago Líquido

En ambas pantallas de cálculo (Honorarios y Contrato), el cálculo se realiza de la siguiente manera:

- **Empleados a Honorarios**: `pagoLiquido = montoBruto - (montoBruto * 0.13)`
- **Empleados con Contrato**: `pagoLiquido = montoBruto - (montoBruto * 0.20)`

### Navegación

La navegación entre las actividades se maneja usando **Intents**. Los botones de la pantalla principal llaman a las actividades correspondientes, y los botones de regreso en las pantallas de cálculo invocan `finish()` para volver a la pantalla principal.

---


## Cómo Ejecutar la Aplicación

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/TuUsuario/TuRepositorio.git
   
2. Abre el proyecto en Android Studio:

Abre Android Studio.
Selecciona "Open an existing project" y elige la carpeta del proyecto.
Compila y ejecuta el proyecto:

3. Conecta un dispositivo Android o usa un emulador.
Haz clic en el botón "Run" (el ícono de play) para compilar y ejecutar la aplicación.
