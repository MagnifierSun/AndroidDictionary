/*      */ package android.provider;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.content.Intent;
/*      */ import android.net.Uri;
/*      */ import android.telephony.SmsMessage;
/*      */ import java.util.Set;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class Telephony
/*      */ {
/*      */   Telephony() {
/*  103 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface BaseMmsColumns
/*      */     extends BaseColumns
/*      */   {
/*      */     public static final String CONTENT_CLASS = "ct_cls";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CONTENT_LOCATION = "ct_l";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CONTENT_TYPE = "ct_t";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CREATOR = "creator";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE = "date";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE_SENT = "date_sent";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DELIVERY_REPORT = "d_rpt";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DELIVERY_TIME = "d_tm";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String EXPIRY = "exp";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String LOCKED = "locked";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MESSAGE_BOX = "msg_box";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_ALL = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_DRAFTS = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_FAILED = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_INBOX = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_OUTBOX = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_BOX_SENT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MESSAGE_CLASS = "m_cls";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MESSAGE_ID = "m_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MESSAGE_SIZE = "m_size";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MESSAGE_TYPE = "m_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MMS_VERSION = "v";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PRIORITY = "pri";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String READ = "read";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String READ_REPORT = "rr";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String READ_STATUS = "read_status";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String REPORT_ALLOWED = "rpt_a";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String RESPONSE_STATUS = "resp_st";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String RESPONSE_TEXT = "resp_txt";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String RETRIEVE_STATUS = "retr_st";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String RETRIEVE_TEXT = "retr_txt";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String RETRIEVE_TEXT_CHARSET = "retr_txt_cs";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SEEN = "seen";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String STATUS = "st";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBJECT = "sub";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBJECT_CHARSET = "sub_cs";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBSCRIPTION_ID = "sub_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TEXT_ONLY = "text_only";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String THREAD_ID = "thread_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TRANSACTION_ID = "tr_id";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface CanonicalAddressesColumns
/*      */     extends BaseColumns
/*      */   {
/*      */     public static final String ADDRESS = "address";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class CarrierId
/*      */     implements BaseColumns
/*      */   {
/*      */     public static final String CARRIER_ID = "carrier_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CARRIER_NAME = "carrier_name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     CarrierId() {
/*  411 */       throw new RuntimeException("Stub!");
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
/*      */     
/*      */     public static Uri getUriForSubscriptionId(int subscriptionId) {
/*  428 */       throw new RuntimeException("Stub!");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  451 */     public static final Uri CONTENT_URI = null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final class Carriers
/*      */     implements BaseColumns
/*      */   {
/*      */     public static final String APN = "apn";
/*      */     
/*      */     public static final String AUTH_TYPE = "authtype";
/*      */     @Deprecated
/*      */     public static final String BEARER = "bearer";
/*      */     public static final String CARRIER_ENABLED = "carrier_enabled";
/*      */     
/*      */     Carriers() {
/*  466 */       throw new RuntimeException("Stub!");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  505 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CURRENT = "current";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MCC = "mcc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MMSC = "mmsc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MMSPORT = "mmsport";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MMSPROXY = "mmsproxy";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MNC = "mnc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MVNO_MATCH_DATA = "mvno_match_data";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MVNO_TYPE = "mvno_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String NAME = "name";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String NETWORK_TYPE_BITMASK = "network_type_bitmask";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String NUMERIC = "numeric";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PASSWORD = "password";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PORT = "port";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PROTOCOL = "protocol";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PROXY = "proxy";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String ROAMING_PROTOCOL = "roaming_protocol";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SERVER = "server";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBSCRIPTION_ID = "sub_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TYPE = "type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String USER = "user";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Mms
/*      */     implements BaseMmsColumns
/*      */   {
/*      */     Mms() {
/*  680 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  687 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  700 */     public static final Uri REPORT_REQUEST_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  707 */     public static final Uri REPORT_STATUS_URI = null;
/*      */ 
/*      */     
/*      */     public static final class Addr
/*      */       implements BaseColumns
/*      */     {
/*      */       public static final String ADDRESS = "address";
/*      */       public static final String CHARSET = "charset";
/*      */       public static final String CONTACT_ID = "contact_id";
/*      */       public static final String MSG_ID = "msg_id";
/*      */       public static final String TYPE = "type";
/*      */       
/*      */       Addr() {
/*  720 */         throw new RuntimeException("Stub!");
/*      */       }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Draft
/*      */       implements Telephony.BaseMmsColumns
/*      */     {
/*      */       Draft() {
/*  771 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  778 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Inbox
/*      */       implements Telephony.BaseMmsColumns
/*      */     {
/*      */       Inbox() {
/*  799 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  806 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Intents
/*      */     {
/*      */       public static final String CONTENT_CHANGED_ACTION = "android.intent.action.CONTENT_CHANGED";
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DELETED_CONTENTS = "deleted_contents";
/*      */ 
/*      */ 
/*      */       
/*      */       Intents() {
/*  827 */         throw new RuntimeException("Stub!");
/*      */       }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Outbox
/*      */       implements Telephony.BaseMmsColumns
/*      */     {
/*      */       Outbox() {
/*  856 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  863 */       public static final Uri CONTENT_URI = null;
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */     
/*      */     public static final class Part
/*      */       implements BaseColumns {
/*      */       public static final String CHARSET = "chset";
/*      */       public static final String CONTENT_DISPOSITION = "cd";
/*      */       public static final String CONTENT_ID = "cid";
/*      */       public static final String CONTENT_LOCATION = "cl";
/*      */       public static final String CONTENT_TYPE = "ct";
/*      */       public static final String CT_START = "ctt_s";
/*      */       public static final String CT_TYPE = "ctt_t";
/*      */       public static final String FILENAME = "fn";
/*      */       public static final String MSG_ID = "mid";
/*      */       public static final String NAME = "name";
/*      */       public static final String SEQ = "seq";
/*      */       public static final String TEXT = "text";
/*      */       public static final String _DATA = "_data";
/*      */       
/*      */       Part() {
/*  884 */         throw new RuntimeException("Stub!");
/*      */       }
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Rate
/*      */     {
/*      */       Rate() {
/*  990 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  997 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SENT_TIME = "sent_time";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Sent
/*      */       implements Telephony.BaseMmsColumns
/*      */     {
/*      */       Sent() {
/* 1019 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1026 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class MmsSms
/*      */     implements BaseColumns
/*      */   {
/*      */     MmsSms() {
/* 1049 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1056 */     public static final Uri CONTENT_CONVERSATIONS_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1063 */     public static final Uri CONTENT_DRAFT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1070 */     public static final Uri CONTENT_FILTER_BYPHONE_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1077 */     public static final Uri CONTENT_LOCKED_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1084 */     public static final Uri CONTENT_UNDELIVERED_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1091 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_GENERIC = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_GENERIC_PERMANENT = 10;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_MMS_PROTO_PERMANENT = 12;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_MMS_PROTO_TRANSIENT = 3;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_SMS_PROTO_PERMANENT = 11;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_SMS_PROTO_TRANSIENT = 2;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int ERR_TYPE_TRANSPORT_FAILURE = 4;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MMS_PROTO = 1;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int NO_ERROR = 0;
/*      */ 
/*      */ 
/*      */     
/* 1135 */     public static final Uri SEARCH_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SMS_PROTO = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TYPE_DISCRIMINATOR_COLUMN = "transport_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class PendingMessages
/*      */       implements BaseColumns
/*      */     {
/*      */       PendingMessages() {
/* 1158 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */       
/* 1161 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DUE_TIME = "due_time";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ERROR_CODE = "err_code";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String ERROR_TYPE = "err_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String LAST_TRY = "last_try";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String MSG_ID = "msg_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String MSG_TYPE = "msg_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String PROTO_TYPE = "proto_type";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String RETRY_INDEX = "retry_index";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SUBSCRIPTION_ID = "pending_sub_id";
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class ServiceStateTable
/*      */   {
/*      */     public static final String AUTHORITY = "service-state";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     ServiceStateTable() {
/* 1244 */       throw new RuntimeException("Stub!");
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
/*      */     
/*      */     public static Uri getUriForSubscriptionIdAndField(int subscriptionId, String field) {
/* 1261 */       throw new RuntimeException("Stub!");
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
/*      */     public static Uri getUriForSubscriptionId(int subscriptionId) {
/* 1277 */       throw new RuntimeException("Stub!");
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
/* 1290 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String IS_MANUAL_NETWORK_SELECTION = "is_manual_network_selection";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VOICE_OPERATOR_NUMERIC = "voice_operator_numeric";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VOICE_REG_STATE = "voice_reg_state";
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
/*      */   public static final class Sms
/*      */     implements BaseColumns, TextBasedSmsColumns
/*      */   {
/*      */     Sms() {
/* 1336 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static String getDefaultSmsPackage(Context context) {
/* 1344 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1351 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Conversations
/*      */       implements BaseColumns, Telephony.TextBasedSmsColumns
/*      */     {
/*      */       Conversations() {
/* 1370 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1377 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String MESSAGE_COUNT = "msg_count";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SNIPPET = "snippet";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Draft
/*      */       implements BaseColumns, Telephony.TextBasedSmsColumns
/*      */     {
/*      */       Draft() {
/* 1412 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1419 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Inbox
/*      */       implements BaseColumns, Telephony.TextBasedSmsColumns
/*      */     {
/*      */       Inbox() {
/* 1440 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1447 */       public static final Uri CONTENT_URI = null;
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */ 
/*      */     
/*      */     public static final class Intents
/*      */     {
/*      */       public static final String ACTION_CHANGE_DEFAULT = "android.provider.Telephony.ACTION_CHANGE_DEFAULT";
/*      */       
/*      */       public static final String ACTION_DEFAULT_SMS_PACKAGE_CHANGED = "android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED";
/*      */       public static final String ACTION_EXTERNAL_PROVIDER_CHANGE = "android.provider.action.EXTERNAL_PROVIDER_CHANGE";
/*      */       public static final String DATA_SMS_RECEIVED_ACTION = "android.intent.action.DATA_SMS_RECEIVED";
/*      */       public static final String EXTRA_IS_DEFAULT_SMS_APP = "android.provider.extra.IS_DEFAULT_SMS_APP";
/*      */       public static final String EXTRA_PACKAGE_NAME = "package";
/*      */       public static final int RESULT_SMS_DUPLICATED = 5;
/*      */       public static final int RESULT_SMS_GENERIC_ERROR = 2;
/*      */       public static final int RESULT_SMS_HANDLED = 1;
/*      */       public static final int RESULT_SMS_OUT_OF_MEMORY = 3;
/*      */       
/*      */       Intents() {
/* 1468 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */       
/*      */       public static final int RESULT_SMS_UNSUPPORTED = 4;
/*      */       public static final String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";
/*      */       public static final String SIM_FULL_ACTION = "android.provider.Telephony.SIM_FULL";
/*      */       public static final String SMS_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_CB_RECEIVED";
/*      */       public static final String SMS_DELIVER_ACTION = "android.provider.Telephony.SMS_DELIVER";
/*      */       
/*      */       public static SmsMessage[] getMessagesFromIntent(Intent intent) {
/* 1478 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SMS_REJECTED_ACTION = "android.provider.Telephony.SMS_REJECTED";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED_ACTION = "android.provider.Telephony.SMS_SERVICE_CATEGORY_PROGRAM_DATA_RECEIVED";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String WAP_PUSH_DELIVER_ACTION = "android.provider.Telephony.WAP_PUSH_DELIVER";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String WAP_PUSH_RECEIVED_ACTION = "android.provider.Telephony.WAP_PUSH_RECEIVED";
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Outbox
/*      */       implements BaseColumns, Telephony.TextBasedSmsColumns
/*      */     {
/*      */       Outbox() {
/* 1822 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1829 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final class Sent
/*      */       implements BaseColumns, Telephony.TextBasedSmsColumns
/*      */     {
/*      */       Sent() {
/* 1850 */         throw new RuntimeException("Stub!");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1857 */       public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public static final String DEFAULT_SORT_ORDER = "date DESC";
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface TextBasedSmsColumns
/*      */   {
/*      */     public static final String ADDRESS = "address";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String BODY = "body";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CREATOR = "creator";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE = "date";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String DATE_SENT = "date_sent";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String ERROR_CODE = "error_code";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String LOCKED = "locked";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_ALL = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_DRAFT = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_FAILED = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_INBOX = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_OUTBOX = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_QUEUED = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MESSAGE_TYPE_SENT = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PERSON = "person";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String PROTOCOL = "protocol";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String READ = "read";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String REPLY_PATH_PRESENT = "reply_path_present";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SEEN = "seen";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SERVICE_CENTER = "service_center";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String STATUS = "status";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int STATUS_COMPLETE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int STATUS_FAILED = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int STATUS_NONE = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int STATUS_PENDING = 32;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBJECT = "subject";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String SUBSCRIPTION_ID = "sub_id";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String THREAD_ID = "thread_id";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String TYPE = "type";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Threads
/*      */     implements ThreadsColumns
/*      */   {
/*      */     public static final int BROADCAST_THREAD = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int COMMON_THREAD = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     Threads() {
/* 2063 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static long getOrCreateThreadId(Context context, String recipient) {
/* 2072 */       throw new RuntimeException("Stub!");
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
/*      */     public static long getOrCreateThreadId(Context context, Set<String> recipients) {
/* 2085 */       throw new RuntimeException("Stub!");
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
/* 2100 */     public static final Uri CONTENT_URI = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2107 */     public static final Uri OBSOLETE_THREADS_URI = null;
/*      */   }
/*      */   
/*      */   public static interface ThreadsColumns extends BaseColumns {
/*      */     public static final String ARCHIVED = "archived";
/*      */     public static final String DATE = "date";
/*      */     public static final String ERROR = "error";
/*      */     public static final String HAS_ATTACHMENT = "has_attachment";
/*      */     public static final String MESSAGE_COUNT = "message_count";
/*      */     public static final String READ = "read";
/*      */     public static final String RECIPIENT_IDS = "recipient_ids";
/*      */     public static final String SNIPPET = "snippet";
/*      */     public static final String SNIPPET_CHARSET = "snippet_cs";
/*      */     public static final String TYPE = "type";
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\provider\Telephony.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */