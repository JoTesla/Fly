package com.jotesla.attentionfly;

public class AppSettings {


    public final static String mainFile = "Global";

    protected static final class row {
        public final String name = "field_rows_size";
        public int size;
    }
    protected static final class col {
        public final String name = "field_cols_size";
        public int size;
    }
    protected static class field {
        public col cols;
        public row rows;
    }
    protected static class start_w_settings {
        public final String name = "start_w_settings";
        public boolean value;
    }

    public field field;

    public static final class options {
        public start_w_settings sws;
    }

    public options options;
}
