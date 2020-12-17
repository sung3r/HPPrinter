package printer;



@SuppressWarnings({"UnusedDeclaration"})
public enum AlertSeverityLevel
{
   None,
   Other,
   Unknown,
   Critical,
   Warning,
   WarningBinaryChangeEvent;

   public static AlertSeverityLevel fromId(int value) {
      if (value < values().length && value > -1) return values()[value];
      else return Unknown;
   }
}
