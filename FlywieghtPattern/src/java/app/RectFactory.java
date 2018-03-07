package app;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

class RectFactory
{

private static final Map<Color, MyRect> rectByColor = new HashMap<Color,MyRect>();


 public static MyRect createRect(Color color)
 {
	 List<Map.Entry<Color,MyRect>> list = new ArrayList<>(rectByColor.entrySet());
	/* MyRect myRect = rectByColor.get(color); */
	 MyRect myRect = null ;

   Optional<Map.Entry<Color,MyRect>> entry;

   entry =     list.stream()
	       .filter(e->e.getKey() == color)
	       .findFirst();

	

	 if(!entry.isPresent() )
	 {
	   myRect = new MyRect(color);
	  rectByColor.put(color,myRect);
	  return myRect;
	 }


	 return entry.get().getValue();
 }







}
