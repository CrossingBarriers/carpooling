var directionsDisplay;
var directionsService = new google.maps.DirectionsService();
var map;

function initialize() {
  directionsDisplay = new google.maps.DirectionsRenderer();
  var sanjusto= new google.maps.LatLng(-34.66987, -58.562218);
  var mapOptions = {
    zoom:10,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    center: sanjusto
  }
  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
  directionsDisplay.setMap(map);
  
  var input_1 = /** @type {HTMLInputElement} */(document.getElementById('desde'));

  var autocomplete_1 = new google.maps.places.Autocomplete(input_1);
  
  autocomplete_1.bindTo('bounds', map);

  var input_2 = /** @type {HTMLInputElement} */(document.getElementById('hasta'));

  var autocomplete_2 = new google.maps.places.Autocomplete(input_2);
  
  autocomplete_2.bindTo('bounds', map);
  
  var infowindow = new google.maps.InfoWindow();
  var marker = new google.maps.Marker({
    map: map
  });
  
  //input 1
  google.maps.event.addListener(autocomplete_1, 'place_changed', function() {
    infowindow.close();
    marker.setVisible(false);
    var place_1 = autocomplete_1.getPlace(); 
    
    if (!place_1.geometry) {
      // Inform the user that the place was not found and return.
      input_1.className = 'notfound';
      return;
    }

    // If the place has a geometry, then present it on a map.
    if (place_1.geometry.viewport) {
      map.fitBounds(place_1.geometry.viewport);
    } else {
      map.setCenter(place_1.geometry.location);
      map.setZoom(17);  // Why 17? Because it looks good.
    }
    marker.setIcon(/** @type {google.maps.Icon} */({
      url: place_1.icon,
      size: new google.maps.Size(71, 71),
      origin: new google.maps.Point(0, 0),
      anchor: new google.maps.Point(17, 34),
      scaledSize: new google.maps.Size(35, 35)
    }));
    marker.setPosition(place_1.geometry.location);
    marker.setVisible(true);

    var address = '';
    if (place_1.address_components) {
      address = [
        (place_1.address_components[0] && place_1.address_components[0].short_name || ''),
        (place_1.address_components[1] && place_1.address_components[1].short_name || ''),
        (place_1.address_components[2] && place_1.address_components[2].short_name || '')
      ].join(' ');
    }
    
    /* Para obtener las coordenadas del campo DESDE */
    
    var lat_1 = place_1.geometry.location.pb;
    var lng_1 = place_1.geometry.location.qb;
    
    var desdelatitud = document.getElementById("desdelat");
    desdelatitud.value = lat_1;
    
    var desdelongitud = document.getElementById("desdelong");
    desdelongitud.value = lng_1;
    
    /**/
    
    infowindow.setContent('<div><strong>' + place_1.name + '</strong><br>' + address);
    infowindow.open(map, marker);
    
  });

//fin input 1

//fin input 2
 
	google.maps.event.addListener(autocomplete_2, 'place_changed', 
	function calcRoute() {

		var start = document.getElementById("desde").value;
		var end = document.getElementById("hasta").value;
		
		/* Para obtener las coordenadas del campo HASTA */
	    
	    var place_2 = autocomplete_2.getPlace();
		
	    var lat_2 = place_2.geometry.location.pb;
	    var lng_2 = place_2.geometry.location.qb;
	    
	    var hastalatitud = document.getElementById("hastalat");
	    hastalatitud.value = lat_2;
	    
	    var hastalongitud = document.getElementById("hastalong");
	    hastalongitud.value = lng_2;
	    
	    /**/
  
		var request = {
			  origin:start,
			  destination:end,
			  travelMode: google.maps.DirectionsTravelMode.DRIVING
		  };
		  directionsService.route(request, function(response, status) {
			if (status == google.maps.DirectionsStatus.OK) {
			  directionsDisplay.setDirections(response);
			}
		  });
	});
	
	//input 2
	  
}

google.maps.event.addDomListener(window, 'load', initialize);