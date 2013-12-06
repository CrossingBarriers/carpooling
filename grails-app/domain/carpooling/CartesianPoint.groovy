package carpooling

class CartesianPoint {
	
	Double x
	Double y



   def distanceTo(CartesianPoint  that) {
		double dx = this.x - that.x;
		double dy = this.y - that.y;
		return Math.sqrt(dx*dx + dy*dy);
   }


  CartesianPoint(){}
  CartesianPoint(Double  x,Double y){
	this.x = x
	this.y = y
  }

  String toString(){
	String ret = "("+this.x+";"+this.y+")"
	ret

  }

    static constraints = {
    }
}
