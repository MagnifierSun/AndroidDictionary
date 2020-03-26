/*     */ package android.net;
/*     */ 
/*     */ import java.io.Closeable;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LocalSocket
/*     */   implements Closeable
/*     */ {
/*     */   public static final int SOCKET_DGRAM = 1;
/*     */   public static final int SOCKET_SEQPACKET = 3;
/*     */   public static final int SOCKET_STREAM = 2;
/*     */   
/*     */   public LocalSocket() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalSocket(int sockType) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public String toString() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect(LocalSocketAddress endpoint) throws IOException {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(LocalSocketAddress bindpoint) throws IOException {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LocalSocketAddress getLocalSocketAddress() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream getInputStream() throws IOException {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OutputStream getOutputStream() throws IOException {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void shutdownInput() throws IOException {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void shutdownOutput() throws IOException {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void setReceiveBufferSize(int size) throws IOException {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public int getReceiveBufferSize() throws IOException {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public void setSoTimeout(int n) throws IOException {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public int getSoTimeout() throws IOException {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } public void setSendBufferSize(int n) throws IOException {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public int getSendBufferSize() throws IOException {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public LocalSocketAddress getRemoteSocketAddress() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized boolean isConnected() {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized boolean isBound() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isOutputShutdown() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isInputShutdown() {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public void connect(LocalSocketAddress endpoint, int timeout) throws IOException {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFileDescriptorsForSend(FileDescriptor[] fds) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileDescriptor[] getAncillaryFileDescriptors() throws IOException {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Credentials getPeerCredentials() throws IOException {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileDescriptor getFileDescriptor() {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\net\LocalSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */