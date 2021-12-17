public class Modelo {
 
 private Double moneda;
 private Double cantidad;
 private Double resultado;
 
 public void setMoneda(Double moneda) {
  this.moneda = moneda;
 }
 public void setCantidad(Double cantidad) {
  this.cantidad = cantidad;
 }
 public String getResultado() {
	String resultado2 = String.format("%.3f", resultado);
  return resultado2;
 }
 public void convetirDolarAPeso() {
  resultado = cantidad / moneda;
 }
 public void convertirPesoADolar() {
  resultado = cantidad / moneda;
 }
}