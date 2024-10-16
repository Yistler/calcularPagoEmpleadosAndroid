package employee

class EmpleadoRegular(val monto : Double) : Empleado(monto) {
    override fun calcularLiquito(): Double {
        return monto - (monto * 0.20)
    }
}