/*      */ package android.text.style;public class TtsSpan implements ParcelableSpan { public static final String ANIMACY_ANIMATE = "android.animate"; public static final String ANIMACY_INANIMATE = "android.inanimate"; public static final String ARG_ANIMACY = "android.arg.animacy"; public static final String ARG_CASE = "android.arg.case"; public static final String ARG_COUNTRY_CODE = "android.arg.country_code"; public static final String ARG_CURRENCY = "android.arg.money";
/*      */   public static final String ARG_DAY = "android.arg.day";
/*      */   public static final String ARG_DENOMINATOR = "android.arg.denominator";
/*      */   public static final String ARG_DIGITS = "android.arg.digits";
/*      */   public static final String ARG_DOMAIN = "android.arg.domain";
/*      */   public static final String ARG_EXTENSION = "android.arg.extension";
/*      */   public static final String ARG_FRACTIONAL_PART = "android.arg.fractional_part";
/*      */   public static final String ARG_FRAGMENT_ID = "android.arg.fragment_id";
/*      */   public static final String ARG_GENDER = "android.arg.gender";
/*      */   public static final String ARG_HOURS = "android.arg.hours";
/*      */   public static final String ARG_INTEGER_PART = "android.arg.integer_part";
/*      */   public static final String ARG_MINUTES = "android.arg.minutes";
/*      */   public static final String ARG_MONTH = "android.arg.month";
/*      */   public static final String ARG_MULTIPLICITY = "android.arg.multiplicity";
/*      */   public static final String ARG_NUMBER = "android.arg.number";
/*      */   public static final String ARG_NUMBER_PARTS = "android.arg.number_parts";
/*      */   public static final String ARG_NUMERATOR = "android.arg.numerator";
/*      */   public static final String ARG_PASSWORD = "android.arg.password";
/*      */   public static final String ARG_PATH = "android.arg.path";
/*      */   public static final String ARG_PORT = "android.arg.port";
/*      */   public static final String ARG_PROTOCOL = "android.arg.protocol";
/*      */   public static final String ARG_QUANTITY = "android.arg.quantity";
/*      */   public static final String ARG_QUERY_STRING = "android.arg.query_string";
/*      */   public static final String ARG_TEXT = "android.arg.text";
/*      */   public static final String ARG_UNIT = "android.arg.unit";
/*      */   public static final String ARG_USERNAME = "android.arg.username";
/*      */   public static final String ARG_VERBATIM = "android.arg.verbatim";
/*      */   public static final String ARG_WEEKDAY = "android.arg.weekday";
/*      */   public static final String ARG_YEAR = "android.arg.year";
/*      */   public static final String CASE_ABLATIVE = "android.ablative";
/*      */   public static final String CASE_ACCUSATIVE = "android.accusative";
/*      */   public static final String CASE_DATIVE = "android.dative";
/*      */   public static final String CASE_GENITIVE = "android.genitive";
/*      */   public static final String CASE_INSTRUMENTAL = "android.instrumental";
/*      */   public static final String CASE_LOCATIVE = "android.locative";
/*      */   
/*      */   public TtsSpan(String type, PersistableBundle args) {
/*   38 */     throw new RuntimeException("Stub!");
/*      */   } public static final String CASE_NOMINATIVE = "android.nominative"; public static final String CASE_VOCATIVE = "android.vocative"; public static final String GENDER_FEMALE = "android.female"; public static final String GENDER_MALE = "android.male"; public static final String GENDER_NEUTRAL = "android.neutral"; public static final int MONTH_APRIL = 3; public static final int MONTH_AUGUST = 7; public static final int MONTH_DECEMBER = 11; public static final int MONTH_FEBRUARY = 1; public static final int MONTH_JANUARY = 0; public static final int MONTH_JULY = 6; public static final int MONTH_JUNE = 5; public static final int MONTH_MARCH = 2; public static final int MONTH_MAY = 4; public static final int MONTH_NOVEMBER = 10; public static final int MONTH_OCTOBER = 9; public static final int MONTH_SEPTEMBER = 8; public static final String MULTIPLICITY_DUAL = "android.dual"; public static final String MULTIPLICITY_PLURAL = "android.plural"; public static final String MULTIPLICITY_SINGLE = "android.single"; public static final String TYPE_CARDINAL = "android.type.cardinal"; public static final String TYPE_DATE = "android.type.date"; public static final String TYPE_DECIMAL = "android.type.decimal"; public static final String TYPE_DIGITS = "android.type.digits"; public static final String TYPE_ELECTRONIC = "android.type.electronic"; public static final String TYPE_FRACTION = "android.type.fraction"; public static final String TYPE_MEASURE = "android.type.measure"; public static final String TYPE_MONEY = "android.type.money"; public static final String TYPE_ORDINAL = "android.type.ordinal"; public static final String TYPE_TELEPHONE = "android.type.telephone"; public static final String TYPE_TEXT = "android.type.text"; public static final String TYPE_TIME = "android.type.time"; public static final String TYPE_VERBATIM = "android.type.verbatim"; public static final int WEEKDAY_FRIDAY = 6; public static final int WEEKDAY_MONDAY = 2; public static final int WEEKDAY_SATURDAY = 7; public static final int WEEKDAY_SUNDAY = 1; public static final int WEEKDAY_THURSDAY = 5; public static final int WEEKDAY_TUESDAY = 3; public static final int WEEKDAY_WEDNESDAY = 4; public TtsSpan(Parcel src) {
/*   40 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getType() {
/*   47 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PersistableBundle getArgs() {
/*   54 */     throw new RuntimeException("Stub!");
/*      */   } public int describeContents() {
/*   56 */     throw new RuntimeException("Stub!");
/*      */   } public void writeToParcel(Parcel dest, int flags) {
/*   58 */     throw new RuntimeException("Stub!");
/*      */   } public int getSpanTypeId() {
/*   60 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Builder<C extends Builder<?>>
/*      */   {
/*      */     public Builder(String type) {
/*  567 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TtsSpan build() {
/*  575 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setStringArgument(String arg, String value) {
/*  584 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setIntArgument(String arg, int value) {
/*  592 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setLongArgument(String arg, long value) {
/*  600 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class CardinalBuilder
/*      */     extends SemioticClassBuilder<CardinalBuilder>
/*      */   {
/*      */     public CardinalBuilder() {
/*  614 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CardinalBuilder(long number) {
/*  623 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CardinalBuilder(String number) {
/*  632 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CardinalBuilder setNumber(long number) {
/*  641 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CardinalBuilder setNumber(String number) {
/*  650 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class DateBuilder
/*      */     extends SemioticClassBuilder<DateBuilder>
/*      */   {
/*      */     public DateBuilder() {
/*  664 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DateBuilder(Integer weekday, Integer day, Integer month, Integer year) {
/*  673 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DateBuilder setWeekday(int weekday) {
/*  683 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DateBuilder setDay(int day) {
/*  692 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DateBuilder setMonth(int month) {
/*  701 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DateBuilder setYear(int year) {
/*  710 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class DecimalBuilder
/*      */     extends SemioticClassBuilder<DecimalBuilder>
/*      */   {
/*      */     public DecimalBuilder() {
/*  724 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder(double number, int minimumFractionDigits, int maximumFractionDigits) {
/*  732 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder(String integerPart, String fractionalPart) {
/*  739 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder setArgumentsFromDouble(double number, int minimumFractionDigits, int maximumFractionDigits) {
/*  755 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder setIntegerPart(long integerPart) {
/*  764 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder setIntegerPart(String integerPart) {
/*  773 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DecimalBuilder setFractionalPart(String fractionalPart) {
/*  781 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class DigitsBuilder
/*      */     extends SemioticClassBuilder<DigitsBuilder>
/*      */   {
/*      */     public DigitsBuilder() {
/*  795 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DigitsBuilder(String digits) {
/*  802 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DigitsBuilder setDigits(String digits) {
/*  810 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class ElectronicBuilder
/*      */     extends SemioticClassBuilder<ElectronicBuilder>
/*      */   {
/*      */     public ElectronicBuilder() {
/*  824 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setEmailArguments(String username, String domain) {
/*  834 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setProtocol(String protocol) {
/*  843 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setUsername(String username) {
/*  850 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setPassword(String password) {
/*  857 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setDomain(String domain) {
/*  865 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setPort(int port) {
/*  872 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setPath(String path) {
/*  880 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setQueryString(String queryString) {
/*  888 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public ElectronicBuilder setFragmentId(String fragmentId) {
/*  895 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class FractionBuilder
/*      */     extends SemioticClassBuilder<FractionBuilder>
/*      */   {
/*      */     public FractionBuilder() {
/*  909 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder(long integerPart, long numerator, long denominator) {
/*  917 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setIntegerPart(long integerPart) {
/*  926 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setIntegerPart(String integerPart) {
/*  935 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setNumerator(long numerator) {
/*  944 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setNumerator(String numerator) {
/*  953 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setDenominator(long denominator) {
/*  962 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FractionBuilder setDenominator(String denominator) {
/*  971 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class MeasureBuilder
/*      */     extends SemioticClassBuilder<MeasureBuilder>
/*      */   {
/*      */     public MeasureBuilder() {
/*  985 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setNumber(long number) {
/*  994 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setNumber(String number) {
/* 1003 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setIntegerPart(long integerPart) {
/* 1012 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setIntegerPart(String integerPart) {
/* 1022 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setFractionalPart(String fractionalPart) {
/* 1031 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setNumerator(long numerator) {
/* 1040 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setNumerator(String numerator) {
/* 1049 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setDenominator(long denominator) {
/* 1058 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setDenominator(String denominator) {
/* 1067 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MeasureBuilder setUnit(String unit) {
/* 1076 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class MoneyBuilder
/*      */     extends SemioticClassBuilder<MoneyBuilder>
/*      */   {
/*      */     public MoneyBuilder() {
/* 1090 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MoneyBuilder setIntegerPart(long integerPart) {
/* 1099 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MoneyBuilder setIntegerPart(String integerPart) {
/* 1108 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MoneyBuilder setFractionalPart(String fractionalPart) {
/* 1116 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MoneyBuilder setCurrency(String currency) {
/* 1124 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MoneyBuilder setQuantity(String quantity) {
/* 1132 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class OrdinalBuilder
/*      */     extends SemioticClassBuilder<OrdinalBuilder>
/*      */   {
/*      */     public OrdinalBuilder() {
/* 1146 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OrdinalBuilder(long number) {
/* 1155 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OrdinalBuilder(String number) {
/* 1164 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OrdinalBuilder setNumber(long number) {
/* 1173 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public OrdinalBuilder setNumber(String number) {
/* 1182 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class SemioticClassBuilder<C extends SemioticClassBuilder<?>>
/*      */     extends Builder<C>
/*      */   {
/*      */     public SemioticClassBuilder(String type) {
/* 1195 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setGender(String gender) {
/* 1204 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setAnimacy(String animacy) {
/* 1213 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setMultiplicity(String multiplicity) {
/* 1223 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public C setCase(String grammaticalCase) {
/* 1235 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class TelephoneBuilder
/*      */     extends SemioticClassBuilder<TelephoneBuilder>
/*      */   {
/*      */     public TelephoneBuilder() {
/* 1249 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TelephoneBuilder(String numberParts) {
/* 1256 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TelephoneBuilder setCountryCode(String countryCode) {
/* 1265 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TelephoneBuilder setNumberParts(String numberParts) {
/* 1274 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TelephoneBuilder setExtension(String extension) {
/* 1282 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class TextBuilder
/*      */     extends SemioticClassBuilder<TextBuilder>
/*      */   {
/*      */     public TextBuilder() {
/* 1296 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TextBuilder(String text) {
/* 1305 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TextBuilder setText(String text) {
/* 1313 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class TimeBuilder
/*      */     extends SemioticClassBuilder<TimeBuilder>
/*      */   {
/*      */     public TimeBuilder() {
/* 1327 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TimeBuilder(int hours, int minutes) {
/* 1334 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TimeBuilder setHours(int hours) {
/* 1343 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public TimeBuilder setMinutes(int minutes) {
/* 1353 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class VerbatimBuilder
/*      */     extends SemioticClassBuilder<VerbatimBuilder>
/*      */   {
/*      */     public VerbatimBuilder() {
/* 1367 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public VerbatimBuilder(String verbatim) {
/* 1374 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public VerbatimBuilder setVerbatim(String verbatim) {
/* 1383 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   } }


/* Location:              M:\learn_android\android.jar!\android\text\style\TtsSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */