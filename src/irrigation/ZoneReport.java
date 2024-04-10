
package irrigation;

/**
 *  The ZoneReport holds data about a particular zone for access by clients.
 *  It is a record class.
 *
 *   @author C. Fox
 *  @version 07/06
 */


public class ZoneReport {

      /* attributes
      /**************/

   public final String id;            // unique zone identifier
   public final String location;      // description from config.txt
   public final int    criticalLevel; // when this zone needs irrigation

      /* constructors
      /****************/

      /**
       *  Initialize the ZoneReport
       */

   public ZoneReport( String theID, 
                      String theLocation, 
                      int theCriticalLevel ) {

      id            = theID;
      location      = theLocation;
      criticalLevel = theCriticalLevel;

   } // ZoneReport

} // ZoneReport
