/*      */ package android.webkit;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.content.pm.PackageInfo;
/*      */ import android.content.res.Configuration;
/*      */ import android.graphics.Bitmap;
/*      */ import android.graphics.Canvas;
/*      */ import android.graphics.Paint;
/*      */ import android.graphics.Picture;
/*      */ import android.graphics.Rect;
/*      */ import android.net.Uri;
/*      */ import android.net.http.SslCertificate;
/*      */ import android.os.Bundle;
/*      */ import android.os.Handler;
/*      */ import android.os.Looper;
/*      */ import android.os.Message;
/*      */ import android.print.PrintDocumentAdapter;
/*      */ import android.util.AttributeSet;
/*      */ import android.util.SparseArray;
/*      */ import android.view.DragEvent;
/*      */ import android.view.KeyEvent;
/*      */ import android.view.MotionEvent;
/*      */ import android.view.View;
/*      */ import android.view.ViewDebug.ExportedProperty;
/*      */ import android.view.ViewGroup;
/*      */ import android.view.ViewStructure;
/*      */ import android.view.ViewTreeObserver;
/*      */ import android.view.accessibility.AccessibilityNodeProvider;
/*      */ import android.view.autofill.AutofillValue;
/*      */ import android.view.inputmethod.EditorInfo;
/*      */ import android.view.inputmethod.InputConnection;
/*      */ import android.view.textclassifier.TextClassifier;
/*      */ import android.widget.AbsoluteLayout;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class WebView
/*      */   extends AbsoluteLayout
/*      */   implements ViewTreeObserver.OnGlobalFocusChangeListener, ViewGroup.OnHierarchyChangeListener
/*      */ {
/*      */   public static final int RENDERER_PRIORITY_BOUND = 1;
/*      */   public static final int RENDERER_PRIORITY_IMPORTANT = 2;
/*      */   public static final int RENDERER_PRIORITY_WAIVED = 0;
/*      */   public static final String SCHEME_GEO = "geo:0,0?q=";
/*      */   public static final String SCHEME_MAILTO = "mailto:";
/*      */   public static final String SCHEME_TEL = "tel:";
/*      */   
/*      */   public WebView(Context context) {
/*   82 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WebView(Context context, AttributeSet attrs) {
/*   91 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*      */   public WebView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  103 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*      */   public WebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  119 */     super((Context)null); throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public WebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
/*  138 */     super((Context)null); throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setHorizontalScrollbarOverlay(boolean overlay) {
/*  147 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setVerticalScrollbarOverlay(boolean overlay) {
/*  156 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean overlayHorizontalScrollbar() {
/*  165 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean overlayVerticalScrollbar() {
/*  174 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public SslCertificate getCertificate() {
/*  183 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setCertificate(SslCertificate certificate) {
/*  192 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public void savePassword(String host, String username, String password) {
/*  208 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public void setHttpAuthUsernamePassword(String host, String realm, String username, String password) {
/*  221 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   @RecentlyNullable
/*      */   public String[] getHttpAuthUsernamePassword(String host, String realm) {
/*  234 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void destroy() {
/*  242 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNetworkAvailable(boolean networkUp) {
/*  252 */     throw new RuntimeException("Stub!");
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
/*      */   @RecentlyNullable
/*      */   public WebBackForwardList saveState(Bundle outState) {
/*  266 */     throw new RuntimeException("Stub!");
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
/*      */   @RecentlyNullable
/*      */   public WebBackForwardList restoreState(Bundle inState) {
/*  281 */     throw new RuntimeException("Stub!");
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
/*      */   public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {
/*  297 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void loadUrl(String url) {
/*  307 */     throw new RuntimeException("Stub!");
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
/*      */   public void postUrl(String url, byte[] postData) {
/*  319 */     throw new RuntimeException("Stub!");
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
/*      */   public void loadData(String data, @RecentlyNullable String mimeType, @RecentlyNullable String encoding) {
/*  376 */     throw new RuntimeException("Stub!");
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
/*      */   public void loadDataWithBaseURL(@RecentlyNullable String baseUrl, String data, @RecentlyNullable String mimeType, @RecentlyNullable String encoding, @RecentlyNullable String historyUrl) {
/*  425 */     throw new RuntimeException("Stub!");
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
/*      */   public void evaluateJavascript(String script, @RecentlyNullable ValueCallback<String> resultCallback) {
/*  447 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void saveWebArchive(String filename) {
/*  455 */     throw new RuntimeException("Stub!");
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
/*      */   public void saveWebArchive(String basename, boolean autoname, @RecentlyNullable ValueCallback<String> callback) {
/*  472 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void stopLoading() {
/*  478 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void reload() {
/*  484 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canGoBack() {
/*  492 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void goBack() {
/*  498 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canGoForward() {
/*  506 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void goForward() {
/*  512 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean canGoBackOrForward(int steps) {
/*  522 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void goBackOrForward(int steps) {
/*  533 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPrivateBrowsingEnabled() {
/*  539 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean pageUp(boolean top) {
/*  548 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean pageDown(boolean bottom) {
/*  557 */     throw new RuntimeException("Stub!");
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
/*      */   public void postVisualStateCallback(long requestId, VisualStateCallback callback) {
/*  611 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void clearView() {
/*  620 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public Picture capturePicture() {
/*  647 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public PrintDocumentAdapter createPrintDocumentAdapter() {
/*  654 */     throw new RuntimeException("Stub!");
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
/*      */   public PrintDocumentAdapter createPrintDocumentAdapter(String documentName) {
/*  670 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   @ExportedProperty(category = "webview")
/*      */   public float getScale() {
/*  682 */     throw new RuntimeException("Stub!");
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
/*      */   public void setInitialScale(int scaleInPercent) {
/*  703 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void invokeZoomPicker() {
/*  711 */     throw new RuntimeException("Stub!");
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
/*      */   public HitTestResult getHitTestResult() {
/*  732 */     throw new RuntimeException("Stub!");
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
/*      */   public void requestFocusNodeHref(@RecentlyNullable Message hrefMsg) {
/*  750 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void requestImageRef(Message msg) {
/*  760 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "webview")
/*      */   public String getUrl() {
/*  770 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "webview")
/*      */   public String getOriginalUrl() {
/*  782 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "webview")
/*      */   public String getTitle() {
/*  791 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Bitmap getFavicon() {
/*  800 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getProgress() {
/*  808 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @ExportedProperty(category = "webview")
/*      */   public int getContentHeight() {
/*  816 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void pauseTimers() {
/*  824 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void resumeTimers() {
/*  831 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void onPause() {
/*  842 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onResume() {
/*  848 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void freeMemory() {
/*  857 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearCache(boolean includeDiskFiles) {
/*  866 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearFormData() {
/*  875 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearHistory() {
/*  881 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearSslPreferences() {
/*  888 */     throw new RuntimeException("Stub!");
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
/*      */   public static void clearClientCertPreferences(@RecentlyNullable Runnable onCleared) {
/*  903 */     throw new RuntimeException("Stub!");
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
/*      */   public static void startSafeBrowsing(@RecentlyNonNull Context context, @RecentlyNullable ValueCallback<Boolean> callback) {
/*  926 */     throw new RuntimeException("Stub!");
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
/*      */   public static void setSafeBrowsingWhitelist(@RecentlyNonNull List<String> hosts, @RecentlyNullable ValueCallback<Boolean> callback) {
/*  955 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public static Uri getSafeBrowsingPrivacyPolicyUrl() {
/*  965 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WebBackForwardList copyBackForwardList() {
/*  976 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFindListener(FindListener listener) {
/*  985 */     throw new RuntimeException("Stub!");
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
/*      */   public void findNext(boolean forward) {
/*  998 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int findAll(String find) {
/* 1010 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void findAllAsync(String find) {
/* 1021 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public boolean showFindDialog(@RecentlyNullable String text, boolean showIme) {
/* 1039 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   @RecentlyNullable
/*      */   public static String findAddress(String addr) {
/* 1067 */     throw new RuntimeException("Stub!");
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
/*      */   public static void enableSlowWholeDocumentDraw() {
/* 1085 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearMatches() {
/* 1092 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void documentHasImages(Message response) {
/* 1102 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setWebViewClient(WebViewClient client) {
/* 1112 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WebViewClient getWebViewClient() {
/* 1121 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDownloadListener(DownloadListener listener) {
/* 1131 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setWebChromeClient(WebChromeClient client) {
/* 1142 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public WebChromeClient getWebChromeClient() {
/* 1151 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setPictureListener(PictureListener listener) {
/* 1161 */     throw new RuntimeException("Stub!");
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
/*      */   public void addJavascriptInterface(Object object, String name) {
/* 1216 */     throw new RuntimeException("Stub!");
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
/*      */   public void removeJavascriptInterface(@RecentlyNonNull String name) {
/* 1228 */     throw new RuntimeException("Stub!");
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
/*      */   public WebMessagePort[] createWebMessageChannel() {
/* 1242 */     throw new RuntimeException("Stub!");
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
/*      */   public void postWebMessage(WebMessage message, Uri targetOrigin) {
/* 1264 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public WebSettings getSettings() {
/* 1274 */     throw new RuntimeException("Stub!");
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
/*      */   public static void setWebContentsDebuggingEnabled(boolean enabled) {
/* 1288 */     throw new RuntimeException("Stub!");
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
/*      */   public static void setDataDirectorySuffix(String suffix) {
/* 1322 */     throw new RuntimeException("Stub!");
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
/*      */   public static void disableWebView() {
/* 1343 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void onChildViewAdded(View parent, View child) {
/* 1350 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void onChildViewRemoved(View p, View child) {
/* 1357 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void onGlobalFocusChanged(View oldFocus, View newFocus) {
/* 1364 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void setMapTrackballToArrowKeys(boolean setMap) {
/* 1370 */     throw new RuntimeException("Stub!");
/*      */   } public void flingScroll(int vx, int vy) {
/* 1372 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean canZoomIn() {
/* 1384 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean canZoomOut() {
/* 1396 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void zoomBy(float zoomFactor) {
/* 1405 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean zoomIn() {
/* 1413 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean zoomOut() {
/* 1421 */     throw new RuntimeException("Stub!");
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
/*      */   public void setRendererPriorityPolicy(int rendererRequestedPriority, boolean waivedWhenNotVisible) {
/* 1454 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getRendererRequestedPriority() {
/* 1464 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean getRendererPriorityWaivedWhenNotVisible() {
/* 1474 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTextClassifier(@RecentlyNullable TextClassifier textClassifier) {
/* 1482 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public TextClassifier getTextClassifier() {
/* 1491 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public static ClassLoader getWebViewClassLoader() {
/* 1501 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public Looper getWebViewLooper() {
/* 1509 */     throw new RuntimeException("Stub!");
/*      */   } protected void onAttachedToWindow() {
/* 1511 */     throw new RuntimeException("Stub!");
/*      */   } public void setLayoutParams(ViewGroup.LayoutParams params) {
/* 1513 */     throw new RuntimeException("Stub!");
/*      */   } public void setOverScrollMode(int mode) {
/* 1515 */     throw new RuntimeException("Stub!");
/*      */   } public void setScrollBarStyle(int style) {
/* 1517 */     throw new RuntimeException("Stub!");
/*      */   } protected int computeHorizontalScrollRange() {
/* 1519 */     throw new RuntimeException("Stub!");
/*      */   } protected int computeHorizontalScrollOffset() {
/* 1521 */     throw new RuntimeException("Stub!");
/*      */   } protected int computeVerticalScrollRange() {
/* 1523 */     throw new RuntimeException("Stub!");
/*      */   } protected int computeVerticalScrollOffset() {
/* 1525 */     throw new RuntimeException("Stub!");
/*      */   } protected int computeVerticalScrollExtent() {
/* 1527 */     throw new RuntimeException("Stub!");
/*      */   } public void computeScroll() {
/* 1529 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onHoverEvent(MotionEvent event) {
/* 1531 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onTouchEvent(MotionEvent event) {
/* 1533 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onGenericMotionEvent(MotionEvent event) {
/* 1535 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onTrackballEvent(MotionEvent event) {
/* 1537 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 1539 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onKeyUp(int keyCode, KeyEvent event) {
/* 1541 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
/* 1543 */     throw new RuntimeException("Stub!");
/*      */   }
/* 1545 */   public AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); } @Deprecated
/*      */   public boolean shouldDelayChildPressedState() {
/* 1547 */     throw new RuntimeException("Stub!");
/*      */   } public CharSequence getAccessibilityClassName() {
/* 1549 */     throw new RuntimeException("Stub!");
/*      */   } public void onProvideVirtualStructure(ViewStructure structure) {
/* 1551 */     throw new RuntimeException("Stub!");
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
/*      */   public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
/* 1626 */     throw new RuntimeException("Stub!");
/*      */   } public void autofill(SparseArray<AutofillValue> values) {
/* 1628 */     throw new RuntimeException("Stub!");
/*      */   } public boolean isVisibleToUserForAutofill(int virtualId) {
/* 1630 */     throw new RuntimeException("Stub!");
/*      */   } protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
/* 1632 */     throw new RuntimeException("Stub!");
/*      */   } protected void onWindowVisibilityChanged(int visibility) {
/* 1634 */     throw new RuntimeException("Stub!");
/*      */   } protected void onDraw(Canvas canvas) {
/* 1636 */     throw new RuntimeException("Stub!");
/*      */   } public boolean performLongClick() {
/* 1638 */     throw new RuntimeException("Stub!");
/*      */   } protected void onConfigurationChanged(Configuration newConfig) {
/* 1640 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
/* 1650 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onDragEvent(DragEvent event) {
/* 1652 */     throw new RuntimeException("Stub!");
/*      */   } protected void onVisibilityChanged(View changedView, int visibility) {
/* 1654 */     throw new RuntimeException("Stub!");
/*      */   } public void onWindowFocusChanged(boolean hasWindowFocus) {
/* 1656 */     throw new RuntimeException("Stub!");
/*      */   } protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
/* 1658 */     throw new RuntimeException("Stub!");
/*      */   } protected void onSizeChanged(int w, int h, int ow, int oh) {
/* 1660 */     throw new RuntimeException("Stub!");
/*      */   } protected void onScrollChanged(int l, int t, int oldl, int oldt) {
/* 1662 */     throw new RuntimeException("Stub!");
/*      */   } public boolean dispatchKeyEvent(KeyEvent event) {
/* 1664 */     throw new RuntimeException("Stub!");
/*      */   } public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
/* 1666 */     throw new RuntimeException("Stub!");
/*      */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 1668 */     throw new RuntimeException("Stub!");
/*      */   } public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {
/* 1670 */     throw new RuntimeException("Stub!");
/*      */   } public void setBackgroundColor(int color) {
/* 1672 */     throw new RuntimeException("Stub!");
/*      */   } public void setLayerType(int layerType, Paint paint) {
/* 1674 */     throw new RuntimeException("Stub!");
/*      */   } protected void dispatchDraw(Canvas canvas) {
/* 1676 */     throw new RuntimeException("Stub!");
/*      */   } public void onStartTemporaryDetach() {
/* 1678 */     throw new RuntimeException("Stub!");
/*      */   } public void onFinishTemporaryDetach() {
/* 1680 */     throw new RuntimeException("Stub!");
/*      */   } public Handler getHandler() {
/* 1682 */     throw new RuntimeException("Stub!");
/*      */   } public View findFocus() {
/* 1684 */     throw new RuntimeException("Stub!");
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
/*      */   @RecentlyNullable
/*      */   public static PackageInfo getCurrentWebViewPackage() {
/* 1698 */     throw new RuntimeException("Stub!");
/*      */   } public boolean onCheckIsTextEditor() {
/* 1700 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static interface FindListener
/*      */   {
/*      */     void onFindResultReceived(int param1Int1, int param1Int2, boolean param1Boolean);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class HitTestResult
/*      */   {
/*      */     @Deprecated
/*      */     public static final int ANCHOR_TYPE = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EDIT_TEXT_TYPE = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int EMAIL_TYPE = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int GEO_TYPE = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int IMAGE_ANCHOR_TYPE = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int IMAGE_TYPE = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int PHONE_TYPE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SRC_ANCHOR_TYPE = 7;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int UNKNOWN_TYPE = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     HitTestResult() {
/* 1777 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getType() {
/* 1786 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @RecentlyNullable
/*      */     public String getExtra() {
/* 1796 */       throw new RuntimeException("Stub!");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static interface PictureListener
/*      */   {
/*      */     @Deprecated
/*      */     void onNewPicture(WebView param1WebView, @RecentlyNullable Picture param1Picture);
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
/*      */   public static abstract class VisualStateCallback
/*      */   {
/*      */     public VisualStateCallback() {
/* 1891 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onComplete(long param1Long);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public class WebViewTransport
/*      */   {
/*      */     public WebViewTransport() {
/* 1910 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public synchronized void setWebView(WebView webview) {
/* 1918 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public synchronized WebView getWebView() {
/* 1926 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\webkit\WebView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */