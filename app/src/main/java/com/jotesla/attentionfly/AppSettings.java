package com.jotesla.attentionfly;

public class AppSettings {

    public boolean start_w_settings;
    public final static String mainFile = "Global";
    protected static final class row {
        public final String name = "field_rows_size";
        public byte size;
    }
    protected static final class col {
        public final String name = "field_cols_size";
        public byte size;
    }
    protected static class field {
        public col cols;
        public row rows;
    }

    public field fields;
}
