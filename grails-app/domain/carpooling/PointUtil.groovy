package carpooling

class PointUtil {
	private static final Integer  earthRatio=6371
	
	 public CartesianPoint circularToCartesian(Double latitude,Double longitude){
		
				Double latitudeAsRadians = toRadians(Math.abs(latitude))
				if(longitude < 0){
				  longitude +=360
				}
				Double longitudeAsRadias = toRadians(longitude)
				Double x = earthRatio*Math.sin(latitudeAsRadians)*Math.cos(longitudeAsRadias)
				Double y = earthRatio*Math.sin(latitudeAsRadians)*Math.sin(longitudeAsRadias)
		
				return new CartesianPoint(x.trunc(2), y.trunc(2))
			  }
		
			  static  Float toRadians(Double degrees){
				return degrees * Math.PI/180
			  }

    static constraints = {
    }
}
