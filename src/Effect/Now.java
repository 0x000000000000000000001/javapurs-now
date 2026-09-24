    public static Object now = (java.util.function.Supplier<Object>) () -> (double) System.currentTimeMillis();

    public static Object getTimezoneOffset = (java.util.function.Supplier<Object>) () ->
        -java.util.TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60000.0;
