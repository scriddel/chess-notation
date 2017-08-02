package chess.utils;

/**
 * @author Emelyanov (02.08.17)
 */
public final class StringUtils {

  @SafeVarargs
  public static <T> String toDelimitedString(char delimiter, T... objects) {
    return toDelimitedString(delimiter, null, objects);
  }

  @SafeVarargs
  public static <T> String toDelimitedString(char delimiter, Printer<T> printer, T... objects) {
    if (objects.length > 0) {
      final StringBuilder result = new StringBuilder();
      for (T obj : objects)
        if (obj != null) {
          if (result.length() != 0) result.append(delimiter);
          result.append(printer == null ? obj.toString() : printer.print(obj));
        }
      return result.toString();
    }
    return "";
  }

}
