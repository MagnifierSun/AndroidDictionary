/*      */ package android.system;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class OsConstants
/*      */ {
/*      */   OsConstants() {
/*   28 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISBLK(int mode) {
/*   34 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISCHR(int mode) {
/*   40 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISDIR(int mode) {
/*   46 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISFIFO(int mode) {
/*   52 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISREG(int mode) {
/*   58 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISLNK(int mode) {
/*   64 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean S_ISSOCK(int mode) {
/*   70 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static int WEXITSTATUS(int status) {
/*   76 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean WCOREDUMP(int status) {
/*   82 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static int WTERMSIG(int status) {
/*   88 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static int WSTOPSIG(int status) {
/*   94 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean WIFEXITED(int status) {
/*  100 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean WIFSTOPPED(int status) {
/*  106 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean WIFSIGNALED(int status) {
/*  112 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String gaiName(int error) {
/*  119 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String errnoName(int errno) {
/*  126 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */   
/*  129 */   public static final int AF_INET = 0;
/*      */ 
/*      */   
/*  132 */   public static final int AF_INET6 = 0;
/*      */ 
/*      */   
/*  135 */   public static final int AF_UNIX = 0;
/*      */ 
/*      */   
/*  138 */   public static final int AF_UNSPEC = 0;
/*      */ 
/*      */   
/*  141 */   public static final int AI_ADDRCONFIG = 0;
/*      */ 
/*      */   
/*  144 */   public static final int AI_ALL = 0;
/*      */ 
/*      */   
/*  147 */   public static final int AI_CANONNAME = 0;
/*      */ 
/*      */   
/*  150 */   public static final int AI_NUMERICHOST = 0;
/*      */ 
/*      */   
/*  153 */   public static final int AI_NUMERICSERV = 0;
/*      */ 
/*      */   
/*  156 */   public static final int AI_PASSIVE = 0;
/*      */ 
/*      */   
/*  159 */   public static final int AI_V4MAPPED = 0;
/*      */ 
/*      */   
/*  162 */   public static final int CAP_AUDIT_CONTROL = 0;
/*      */ 
/*      */   
/*  165 */   public static final int CAP_AUDIT_WRITE = 0;
/*      */ 
/*      */   
/*  168 */   public static final int CAP_BLOCK_SUSPEND = 0;
/*      */ 
/*      */   
/*  171 */   public static final int CAP_CHOWN = 0;
/*      */ 
/*      */   
/*  174 */   public static final int CAP_DAC_OVERRIDE = 0;
/*      */ 
/*      */   
/*  177 */   public static final int CAP_DAC_READ_SEARCH = 0;
/*      */ 
/*      */   
/*  180 */   public static final int CAP_FOWNER = 0;
/*      */ 
/*      */   
/*  183 */   public static final int CAP_FSETID = 0;
/*      */ 
/*      */   
/*  186 */   public static final int CAP_IPC_LOCK = 0;
/*      */ 
/*      */   
/*  189 */   public static final int CAP_IPC_OWNER = 0;
/*      */ 
/*      */   
/*  192 */   public static final int CAP_KILL = 0;
/*      */ 
/*      */   
/*  195 */   public static final int CAP_LAST_CAP = 0;
/*      */ 
/*      */   
/*  198 */   public static final int CAP_LEASE = 0;
/*      */ 
/*      */   
/*  201 */   public static final int CAP_LINUX_IMMUTABLE = 0;
/*      */ 
/*      */   
/*  204 */   public static final int CAP_MAC_ADMIN = 0;
/*      */ 
/*      */   
/*  207 */   public static final int CAP_MAC_OVERRIDE = 0;
/*      */ 
/*      */   
/*  210 */   public static final int CAP_MKNOD = 0;
/*      */ 
/*      */   
/*  213 */   public static final int CAP_NET_ADMIN = 0;
/*      */ 
/*      */   
/*  216 */   public static final int CAP_NET_BIND_SERVICE = 0;
/*      */ 
/*      */   
/*  219 */   public static final int CAP_NET_BROADCAST = 0;
/*      */ 
/*      */   
/*  222 */   public static final int CAP_NET_RAW = 0;
/*      */ 
/*      */   
/*  225 */   public static final int CAP_SETFCAP = 0;
/*      */ 
/*      */   
/*  228 */   public static final int CAP_SETGID = 0;
/*      */ 
/*      */   
/*  231 */   public static final int CAP_SETPCAP = 0;
/*      */ 
/*      */   
/*  234 */   public static final int CAP_SETUID = 0;
/*      */ 
/*      */   
/*  237 */   public static final int CAP_SYSLOG = 0;
/*      */ 
/*      */   
/*  240 */   public static final int CAP_SYS_ADMIN = 0;
/*      */ 
/*      */   
/*  243 */   public static final int CAP_SYS_BOOT = 0;
/*      */ 
/*      */   
/*  246 */   public static final int CAP_SYS_CHROOT = 0;
/*      */ 
/*      */   
/*  249 */   public static final int CAP_SYS_MODULE = 0;
/*      */ 
/*      */   
/*  252 */   public static final int CAP_SYS_NICE = 0;
/*      */ 
/*      */   
/*  255 */   public static final int CAP_SYS_PACCT = 0;
/*      */ 
/*      */   
/*  258 */   public static final int CAP_SYS_PTRACE = 0;
/*      */ 
/*      */   
/*  261 */   public static final int CAP_SYS_RAWIO = 0;
/*      */ 
/*      */   
/*  264 */   public static final int CAP_SYS_RESOURCE = 0;
/*      */ 
/*      */   
/*  267 */   public static final int CAP_SYS_TIME = 0;
/*      */ 
/*      */   
/*  270 */   public static final int CAP_SYS_TTY_CONFIG = 0;
/*      */ 
/*      */   
/*  273 */   public static final int CAP_WAKE_ALARM = 0;
/*      */ 
/*      */   
/*  276 */   public static final int E2BIG = 0;
/*      */ 
/*      */   
/*  279 */   public static final int EACCES = 0;
/*      */ 
/*      */   
/*  282 */   public static final int EADDRINUSE = 0;
/*      */ 
/*      */   
/*  285 */   public static final int EADDRNOTAVAIL = 0;
/*      */ 
/*      */   
/*  288 */   public static final int EAFNOSUPPORT = 0;
/*      */ 
/*      */   
/*  291 */   public static final int EAGAIN = 0;
/*      */ 
/*      */   
/*  294 */   public static final int EAI_AGAIN = 0;
/*      */ 
/*      */   
/*  297 */   public static final int EAI_BADFLAGS = 0;
/*      */ 
/*      */   
/*  300 */   public static final int EAI_FAIL = 0;
/*      */ 
/*      */   
/*  303 */   public static final int EAI_FAMILY = 0;
/*      */ 
/*      */   
/*  306 */   public static final int EAI_MEMORY = 0;
/*      */ 
/*      */   
/*  309 */   public static final int EAI_NODATA = 0;
/*      */ 
/*      */   
/*  312 */   public static final int EAI_NONAME = 0;
/*      */ 
/*      */   
/*  315 */   public static final int EAI_OVERFLOW = 0;
/*      */ 
/*      */   
/*  318 */   public static final int EAI_SERVICE = 0;
/*      */ 
/*      */   
/*  321 */   public static final int EAI_SOCKTYPE = 0;
/*      */ 
/*      */   
/*  324 */   public static final int EAI_SYSTEM = 0;
/*      */ 
/*      */   
/*  327 */   public static final int EALREADY = 0;
/*      */ 
/*      */   
/*  330 */   public static final int EBADF = 0;
/*      */ 
/*      */   
/*  333 */   public static final int EBADMSG = 0;
/*      */ 
/*      */   
/*  336 */   public static final int EBUSY = 0;
/*      */ 
/*      */   
/*  339 */   public static final int ECANCELED = 0;
/*      */ 
/*      */   
/*  342 */   public static final int ECHILD = 0;
/*      */ 
/*      */   
/*  345 */   public static final int ECONNABORTED = 0;
/*      */ 
/*      */   
/*  348 */   public static final int ECONNREFUSED = 0;
/*      */ 
/*      */   
/*  351 */   public static final int ECONNRESET = 0;
/*      */ 
/*      */   
/*  354 */   public static final int EDEADLK = 0;
/*      */ 
/*      */   
/*  357 */   public static final int EDESTADDRREQ = 0;
/*      */ 
/*      */   
/*  360 */   public static final int EDOM = 0;
/*      */ 
/*      */   
/*  363 */   public static final int EDQUOT = 0;
/*      */ 
/*      */   
/*  366 */   public static final int EEXIST = 0;
/*      */ 
/*      */   
/*  369 */   public static final int EFAULT = 0;
/*      */ 
/*      */   
/*  372 */   public static final int EFBIG = 0;
/*      */ 
/*      */   
/*  375 */   public static final int EHOSTUNREACH = 0;
/*      */ 
/*      */   
/*  378 */   public static final int EIDRM = 0;
/*      */ 
/*      */   
/*  381 */   public static final int EILSEQ = 0;
/*      */ 
/*      */   
/*  384 */   public static final int EINPROGRESS = 0;
/*      */ 
/*      */   
/*  387 */   public static final int EINTR = 0;
/*      */ 
/*      */   
/*  390 */   public static final int EINVAL = 0;
/*      */ 
/*      */   
/*  393 */   public static final int EIO = 0;
/*      */ 
/*      */   
/*  396 */   public static final int EISCONN = 0;
/*      */ 
/*      */   
/*  399 */   public static final int EISDIR = 0;
/*      */ 
/*      */   
/*  402 */   public static final int ELOOP = 0;
/*      */ 
/*      */   
/*  405 */   public static final int EMFILE = 0;
/*      */ 
/*      */   
/*  408 */   public static final int EMLINK = 0;
/*      */ 
/*      */   
/*  411 */   public static final int EMSGSIZE = 0;
/*      */ 
/*      */   
/*  414 */   public static final int EMULTIHOP = 0;
/*      */ 
/*      */   
/*  417 */   public static final int ENAMETOOLONG = 0;
/*      */ 
/*      */   
/*  420 */   public static final int ENETDOWN = 0;
/*      */ 
/*      */   
/*  423 */   public static final int ENETRESET = 0;
/*      */ 
/*      */   
/*  426 */   public static final int ENETUNREACH = 0;
/*      */ 
/*      */   
/*  429 */   public static final int ENFILE = 0;
/*      */ 
/*      */   
/*  432 */   public static final int ENOBUFS = 0;
/*      */ 
/*      */   
/*  435 */   public static final int ENODATA = 0;
/*      */ 
/*      */   
/*  438 */   public static final int ENODEV = 0;
/*      */ 
/*      */   
/*  441 */   public static final int ENOENT = 0;
/*      */ 
/*      */   
/*  444 */   public static final int ENOEXEC = 0;
/*      */ 
/*      */   
/*  447 */   public static final int ENOLCK = 0;
/*      */ 
/*      */   
/*  450 */   public static final int ENOLINK = 0;
/*      */ 
/*      */   
/*  453 */   public static final int ENOMEM = 0;
/*      */ 
/*      */   
/*  456 */   public static final int ENOMSG = 0;
/*      */ 
/*      */   
/*  459 */   public static final int ENOPROTOOPT = 0;
/*      */ 
/*      */   
/*  462 */   public static final int ENOSPC = 0;
/*      */ 
/*      */   
/*  465 */   public static final int ENOSR = 0;
/*      */ 
/*      */   
/*  468 */   public static final int ENOSTR = 0;
/*      */ 
/*      */   
/*  471 */   public static final int ENOSYS = 0;
/*      */ 
/*      */   
/*  474 */   public static final int ENOTCONN = 0;
/*      */ 
/*      */   
/*  477 */   public static final int ENOTDIR = 0;
/*      */ 
/*      */   
/*  480 */   public static final int ENOTEMPTY = 0;
/*      */ 
/*      */   
/*  483 */   public static final int ENOTSOCK = 0;
/*      */ 
/*      */   
/*  486 */   public static final int ENOTSUP = 0;
/*      */ 
/*      */   
/*  489 */   public static final int ENOTTY = 0;
/*      */ 
/*      */   
/*  492 */   public static final int ENXIO = 0;
/*      */ 
/*      */   
/*  495 */   public static final int EOPNOTSUPP = 0;
/*      */ 
/*      */   
/*  498 */   public static final int EOVERFLOW = 0;
/*      */ 
/*      */   
/*  501 */   public static final int EPERM = 0;
/*      */ 
/*      */   
/*  504 */   public static final int EPIPE = 0;
/*      */ 
/*      */   
/*  507 */   public static final int EPROTO = 0;
/*      */ 
/*      */   
/*  510 */   public static final int EPROTONOSUPPORT = 0;
/*      */ 
/*      */   
/*  513 */   public static final int EPROTOTYPE = 0;
/*      */ 
/*      */   
/*  516 */   public static final int ERANGE = 0;
/*      */ 
/*      */   
/*  519 */   public static final int EROFS = 0;
/*      */ 
/*      */   
/*  522 */   public static final int ESPIPE = 0;
/*      */ 
/*      */   
/*  525 */   public static final int ESRCH = 0;
/*      */ 
/*      */   
/*  528 */   public static final int ESTALE = 0;
/*      */ 
/*      */   
/*  531 */   public static final int ETIME = 0;
/*      */ 
/*      */   
/*  534 */   public static final int ETIMEDOUT = 0;
/*      */ 
/*      */   
/*  537 */   public static final int ETXTBSY = 0;
/*      */ 
/*      */   
/*  540 */   public static final int EXDEV = 0;
/*      */ 
/*      */   
/*  543 */   public static final int EXIT_FAILURE = 0;
/*      */ 
/*      */   
/*  546 */   public static final int EXIT_SUCCESS = 0;
/*      */ 
/*      */   
/*  549 */   public static final int FD_CLOEXEC = 0;
/*      */ 
/*      */   
/*  552 */   public static final int FIONREAD = 0;
/*      */ 
/*      */   
/*  555 */   public static final int F_DUPFD = 0;
/*      */ 
/*      */   
/*  558 */   public static final int F_DUPFD_CLOEXEC = 0;
/*      */ 
/*      */   
/*  561 */   public static final int F_GETFD = 0;
/*      */ 
/*      */   
/*  564 */   public static final int F_GETFL = 0;
/*      */ 
/*      */   
/*  567 */   public static final int F_GETLK = 0;
/*      */ 
/*      */   
/*  570 */   public static final int F_GETLK64 = 0;
/*      */ 
/*      */   
/*  573 */   public static final int F_GETOWN = 0;
/*      */ 
/*      */   
/*  576 */   public static final int F_OK = 0;
/*      */ 
/*      */   
/*  579 */   public static final int F_RDLCK = 0;
/*      */ 
/*      */   
/*  582 */   public static final int F_SETFD = 0;
/*      */ 
/*      */   
/*  585 */   public static final int F_SETFL = 0;
/*      */ 
/*      */   
/*  588 */   public static final int F_SETLK = 0;
/*      */ 
/*      */   
/*  591 */   public static final int F_SETLK64 = 0;
/*      */ 
/*      */   
/*  594 */   public static final int F_SETLKW = 0;
/*      */ 
/*      */   
/*  597 */   public static final int F_SETLKW64 = 0;
/*      */ 
/*      */   
/*  600 */   public static final int F_SETOWN = 0;
/*      */ 
/*      */   
/*  603 */   public static final int F_UNLCK = 0;
/*      */ 
/*      */   
/*  606 */   public static final int F_WRLCK = 0;
/*      */ 
/*      */   
/*  609 */   public static final int IFA_F_DADFAILED = 0;
/*      */ 
/*      */   
/*  612 */   public static final int IFA_F_DEPRECATED = 0;
/*      */ 
/*      */   
/*  615 */   public static final int IFA_F_HOMEADDRESS = 0;
/*      */ 
/*      */   
/*  618 */   public static final int IFA_F_NODAD = 0;
/*      */ 
/*      */   
/*  621 */   public static final int IFA_F_OPTIMISTIC = 0;
/*      */ 
/*      */   
/*  624 */   public static final int IFA_F_PERMANENT = 0;
/*      */ 
/*      */   
/*  627 */   public static final int IFA_F_SECONDARY = 0;
/*      */ 
/*      */   
/*  630 */   public static final int IFA_F_TEMPORARY = 0;
/*      */ 
/*      */   
/*  633 */   public static final int IFA_F_TENTATIVE = 0;
/*      */ 
/*      */   
/*  636 */   public static final int IFF_ALLMULTI = 0;
/*      */ 
/*      */   
/*  639 */   public static final int IFF_AUTOMEDIA = 0;
/*      */ 
/*      */   
/*  642 */   public static final int IFF_BROADCAST = 0;
/*      */ 
/*      */   
/*  645 */   public static final int IFF_DEBUG = 0;
/*      */ 
/*      */   
/*  648 */   public static final int IFF_DYNAMIC = 0;
/*      */ 
/*      */   
/*  651 */   public static final int IFF_LOOPBACK = 0;
/*      */ 
/*      */   
/*  654 */   public static final int IFF_MASTER = 0;
/*      */ 
/*      */   
/*  657 */   public static final int IFF_MULTICAST = 0;
/*      */ 
/*      */   
/*  660 */   public static final int IFF_NOARP = 0;
/*      */ 
/*      */   
/*  663 */   public static final int IFF_NOTRAILERS = 0;
/*      */ 
/*      */   
/*  666 */   public static final int IFF_POINTOPOINT = 0;
/*      */ 
/*      */   
/*  669 */   public static final int IFF_PORTSEL = 0;
/*      */ 
/*      */   
/*  672 */   public static final int IFF_PROMISC = 0;
/*      */ 
/*      */   
/*  675 */   public static final int IFF_RUNNING = 0;
/*      */ 
/*      */   
/*  678 */   public static final int IFF_SLAVE = 0;
/*      */ 
/*      */   
/*  681 */   public static final int IFF_UP = 0;
/*      */ 
/*      */   
/*  684 */   public static final int IPPROTO_ICMP = 0;
/*      */ 
/*      */   
/*  687 */   public static final int IPPROTO_ICMPV6 = 0;
/*      */ 
/*      */   
/*  690 */   public static final int IPPROTO_IP = 0;
/*      */ 
/*      */   
/*  693 */   public static final int IPPROTO_IPV6 = 0;
/*      */ 
/*      */   
/*  696 */   public static final int IPPROTO_RAW = 0;
/*      */ 
/*      */   
/*  699 */   public static final int IPPROTO_TCP = 0;
/*      */ 
/*      */   
/*  702 */   public static final int IPPROTO_UDP = 0;
/*      */ 
/*      */   
/*  705 */   public static final int IPV6_CHECKSUM = 0;
/*      */ 
/*      */   
/*  708 */   public static final int IPV6_MULTICAST_HOPS = 0;
/*      */ 
/*      */   
/*  711 */   public static final int IPV6_MULTICAST_IF = 0;
/*      */ 
/*      */   
/*  714 */   public static final int IPV6_MULTICAST_LOOP = 0;
/*      */ 
/*      */   
/*  717 */   public static final int IPV6_RECVDSTOPTS = 0;
/*      */ 
/*      */   
/*  720 */   public static final int IPV6_RECVHOPLIMIT = 0;
/*      */ 
/*      */   
/*  723 */   public static final int IPV6_RECVHOPOPTS = 0;
/*      */ 
/*      */   
/*  726 */   public static final int IPV6_RECVPKTINFO = 0;
/*      */ 
/*      */   
/*  729 */   public static final int IPV6_RECVRTHDR = 0;
/*      */ 
/*      */   
/*  732 */   public static final int IPV6_RECVTCLASS = 0;
/*      */ 
/*      */   
/*  735 */   public static final int IPV6_TCLASS = 0;
/*      */ 
/*      */   
/*  738 */   public static final int IPV6_UNICAST_HOPS = 0;
/*      */ 
/*      */   
/*  741 */   public static final int IPV6_V6ONLY = 0;
/*      */ 
/*      */   
/*  744 */   public static final int IP_MULTICAST_IF = 0;
/*      */ 
/*      */   
/*  747 */   public static final int IP_MULTICAST_LOOP = 0;
/*      */ 
/*      */   
/*  750 */   public static final int IP_MULTICAST_TTL = 0;
/*      */ 
/*      */   
/*  753 */   public static final int IP_TOS = 0;
/*      */ 
/*      */   
/*  756 */   public static final int IP_TTL = 0;
/*      */ 
/*      */   
/*  759 */   public static final int MAP_FIXED = 0;
/*      */ 
/*      */   
/*  762 */   public static final int MAP_PRIVATE = 0;
/*      */ 
/*      */   
/*  765 */   public static final int MAP_SHARED = 0;
/*      */ 
/*      */   
/*  768 */   public static final int MCAST_BLOCK_SOURCE = 0;
/*      */ 
/*      */   
/*  771 */   public static final int MCAST_JOIN_GROUP = 0;
/*      */ 
/*      */   
/*  774 */   public static final int MCAST_JOIN_SOURCE_GROUP = 0;
/*      */ 
/*      */   
/*  777 */   public static final int MCAST_LEAVE_GROUP = 0;
/*      */ 
/*      */   
/*  780 */   public static final int MCAST_LEAVE_SOURCE_GROUP = 0;
/*      */ 
/*      */   
/*  783 */   public static final int MCAST_UNBLOCK_SOURCE = 0;
/*      */ 
/*      */   
/*  786 */   public static final int MCL_CURRENT = 0;
/*      */ 
/*      */   
/*  789 */   public static final int MCL_FUTURE = 0;
/*      */ 
/*      */   
/*  792 */   public static final int MSG_CTRUNC = 0;
/*      */ 
/*      */   
/*  795 */   public static final int MSG_DONTROUTE = 0;
/*      */ 
/*      */   
/*  798 */   public static final int MSG_EOR = 0;
/*      */ 
/*      */   
/*  801 */   public static final int MSG_OOB = 0;
/*      */ 
/*      */   
/*  804 */   public static final int MSG_PEEK = 0;
/*      */ 
/*      */   
/*  807 */   public static final int MSG_TRUNC = 0;
/*      */ 
/*      */   
/*  810 */   public static final int MSG_WAITALL = 0;
/*      */ 
/*      */   
/*  813 */   public static final int MS_ASYNC = 0;
/*      */ 
/*      */   
/*  816 */   public static final int MS_INVALIDATE = 0;
/*      */ 
/*      */   
/*  819 */   public static final int MS_SYNC = 0;
/*      */ 
/*      */   
/*  822 */   public static final int NI_DGRAM = 0;
/*      */ 
/*      */   
/*  825 */   public static final int NI_NAMEREQD = 0;
/*      */ 
/*      */   
/*  828 */   public static final int NI_NOFQDN = 0;
/*      */ 
/*      */   
/*  831 */   public static final int NI_NUMERICHOST = 0;
/*      */ 
/*      */   
/*  834 */   public static final int NI_NUMERICSERV = 0;
/*      */ 
/*      */   
/*  837 */   public static final int O_ACCMODE = 0;
/*      */ 
/*      */   
/*  840 */   public static final int O_APPEND = 0;
/*      */ 
/*      */   
/*  843 */   public static final int O_CLOEXEC = 0;
/*      */ 
/*      */   
/*  846 */   public static final int O_CREAT = 0;
/*      */ 
/*      */   
/*  849 */   public static final int O_DSYNC = 0;
/*      */ 
/*      */   
/*  852 */   public static final int O_EXCL = 0;
/*      */ 
/*      */   
/*  855 */   public static final int O_NOCTTY = 0;
/*      */ 
/*      */   
/*  858 */   public static final int O_NOFOLLOW = 0;
/*      */ 
/*      */   
/*  861 */   public static final int O_NONBLOCK = 0;
/*      */ 
/*      */   
/*  864 */   public static final int O_RDONLY = 0;
/*      */ 
/*      */   
/*  867 */   public static final int O_RDWR = 0;
/*      */ 
/*      */   
/*  870 */   public static final int O_SYNC = 0;
/*      */ 
/*      */   
/*  873 */   public static final int O_TRUNC = 0;
/*      */ 
/*      */   
/*  876 */   public static final int O_WRONLY = 0;
/*      */ 
/*      */   
/*  879 */   public static final int POLLERR = 0;
/*      */ 
/*      */   
/*  882 */   public static final int POLLHUP = 0;
/*      */ 
/*      */   
/*  885 */   public static final int POLLIN = 0;
/*      */ 
/*      */   
/*  888 */   public static final int POLLNVAL = 0;
/*      */ 
/*      */   
/*  891 */   public static final int POLLOUT = 0;
/*      */ 
/*      */   
/*  894 */   public static final int POLLPRI = 0;
/*      */ 
/*      */   
/*  897 */   public static final int POLLRDBAND = 0;
/*      */ 
/*      */   
/*  900 */   public static final int POLLRDNORM = 0;
/*      */ 
/*      */   
/*  903 */   public static final int POLLWRBAND = 0;
/*      */ 
/*      */   
/*  906 */   public static final int POLLWRNORM = 0;
/*      */ 
/*      */   
/*  909 */   public static final int PROT_EXEC = 0;
/*      */ 
/*      */   
/*  912 */   public static final int PROT_NONE = 0;
/*      */ 
/*      */   
/*  915 */   public static final int PROT_READ = 0;
/*      */ 
/*      */   
/*  918 */   public static final int PROT_WRITE = 0;
/*      */ 
/*      */   
/*  921 */   public static final int PR_GET_DUMPABLE = 0;
/*      */ 
/*      */   
/*  924 */   public static final int PR_SET_DUMPABLE = 0;
/*      */ 
/*      */   
/*  927 */   public static final int PR_SET_NO_NEW_PRIVS = 0;
/*      */ 
/*      */   
/*  930 */   public static final int RT_SCOPE_HOST = 0;
/*      */ 
/*      */   
/*  933 */   public static final int RT_SCOPE_LINK = 0;
/*      */ 
/*      */   
/*  936 */   public static final int RT_SCOPE_NOWHERE = 0;
/*      */ 
/*      */   
/*  939 */   public static final int RT_SCOPE_SITE = 0;
/*      */ 
/*      */   
/*  942 */   public static final int RT_SCOPE_UNIVERSE = 0;
/*      */ 
/*      */   
/*  945 */   public static final int R_OK = 0;
/*      */ 
/*      */   
/*  948 */   public static final int SEEK_CUR = 0;
/*      */ 
/*      */   
/*  951 */   public static final int SEEK_END = 0;
/*      */ 
/*      */   
/*  954 */   public static final int SEEK_SET = 0;
/*      */ 
/*      */   
/*  957 */   public static final int SHUT_RD = 0;
/*      */ 
/*      */   
/*  960 */   public static final int SHUT_RDWR = 0;
/*      */ 
/*      */   
/*  963 */   public static final int SHUT_WR = 0;
/*      */ 
/*      */   
/*  966 */   public static final int SIGABRT = 0;
/*      */ 
/*      */   
/*  969 */   public static final int SIGALRM = 0;
/*      */ 
/*      */   
/*  972 */   public static final int SIGBUS = 0;
/*      */ 
/*      */   
/*  975 */   public static final int SIGCHLD = 0;
/*      */ 
/*      */   
/*  978 */   public static final int SIGCONT = 0;
/*      */ 
/*      */   
/*  981 */   public static final int SIGFPE = 0;
/*      */ 
/*      */   
/*  984 */   public static final int SIGHUP = 0;
/*      */ 
/*      */   
/*  987 */   public static final int SIGILL = 0;
/*      */ 
/*      */   
/*  990 */   public static final int SIGINT = 0;
/*      */ 
/*      */   
/*  993 */   public static final int SIGIO = 0;
/*      */ 
/*      */   
/*  996 */   public static final int SIGKILL = 0;
/*      */ 
/*      */   
/*  999 */   public static final int SIGPIPE = 0;
/*      */ 
/*      */   
/* 1002 */   public static final int SIGPROF = 0;
/*      */ 
/*      */   
/* 1005 */   public static final int SIGPWR = 0;
/*      */ 
/*      */   
/* 1008 */   public static final int SIGQUIT = 0;
/*      */ 
/*      */   
/* 1011 */   public static final int SIGRTMAX = 0;
/*      */ 
/*      */   
/* 1014 */   public static final int SIGRTMIN = 0;
/*      */ 
/*      */   
/* 1017 */   public static final int SIGSEGV = 0;
/*      */ 
/*      */   
/* 1020 */   public static final int SIGSTKFLT = 0;
/*      */ 
/*      */   
/* 1023 */   public static final int SIGSTOP = 0;
/*      */ 
/*      */   
/* 1026 */   public static final int SIGSYS = 0;
/*      */ 
/*      */   
/* 1029 */   public static final int SIGTERM = 0;
/*      */ 
/*      */   
/* 1032 */   public static final int SIGTRAP = 0;
/*      */ 
/*      */   
/* 1035 */   public static final int SIGTSTP = 0;
/*      */ 
/*      */   
/* 1038 */   public static final int SIGTTIN = 0;
/*      */ 
/*      */   
/* 1041 */   public static final int SIGTTOU = 0;
/*      */ 
/*      */   
/* 1044 */   public static final int SIGURG = 0;
/*      */ 
/*      */   
/* 1047 */   public static final int SIGUSR1 = 0;
/*      */ 
/*      */   
/* 1050 */   public static final int SIGUSR2 = 0;
/*      */ 
/*      */   
/* 1053 */   public static final int SIGVTALRM = 0;
/*      */ 
/*      */   
/* 1056 */   public static final int SIGWINCH = 0;
/*      */ 
/*      */   
/* 1059 */   public static final int SIGXCPU = 0;
/*      */ 
/*      */   
/* 1062 */   public static final int SIGXFSZ = 0;
/*      */ 
/*      */   
/* 1065 */   public static final int SIOCGIFADDR = 0;
/*      */ 
/*      */   
/* 1068 */   public static final int SIOCGIFBRDADDR = 0;
/*      */ 
/*      */   
/* 1071 */   public static final int SIOCGIFDSTADDR = 0;
/*      */ 
/*      */   
/* 1074 */   public static final int SIOCGIFNETMASK = 0;
/*      */ 
/*      */   
/* 1077 */   public static final int SOCK_DGRAM = 0;
/*      */ 
/*      */   
/* 1080 */   public static final int SOCK_RAW = 0;
/*      */ 
/*      */   
/* 1083 */   public static final int SOCK_SEQPACKET = 0;
/*      */ 
/*      */   
/* 1086 */   public static final int SOCK_STREAM = 0;
/*      */ 
/*      */   
/* 1089 */   public static final int SOL_SOCKET = 0;
/*      */ 
/*      */   
/* 1092 */   public static final int SO_BINDTODEVICE = 0;
/*      */ 
/*      */   
/* 1095 */   public static final int SO_BROADCAST = 0;
/*      */ 
/*      */   
/* 1098 */   public static final int SO_DEBUG = 0;
/*      */ 
/*      */   
/* 1101 */   public static final int SO_DONTROUTE = 0;
/*      */ 
/*      */   
/* 1104 */   public static final int SO_ERROR = 0;
/*      */ 
/*      */   
/* 1107 */   public static final int SO_KEEPALIVE = 0;
/*      */ 
/*      */   
/* 1110 */   public static final int SO_LINGER = 0;
/*      */ 
/*      */   
/* 1113 */   public static final int SO_OOBINLINE = 0;
/*      */ 
/*      */   
/* 1116 */   public static final int SO_PASSCRED = 0;
/*      */ 
/*      */   
/* 1119 */   public static final int SO_PEERCRED = 0;
/*      */ 
/*      */   
/* 1122 */   public static final int SO_RCVBUF = 0;
/*      */ 
/*      */   
/* 1125 */   public static final int SO_RCVLOWAT = 0;
/*      */ 
/*      */   
/* 1128 */   public static final int SO_RCVTIMEO = 0;
/*      */ 
/*      */   
/* 1131 */   public static final int SO_REUSEADDR = 0;
/*      */ 
/*      */   
/* 1134 */   public static final int SO_SNDBUF = 0;
/*      */ 
/*      */   
/* 1137 */   public static final int SO_SNDLOWAT = 0;
/*      */ 
/*      */   
/* 1140 */   public static final int SO_SNDTIMEO = 0;
/*      */ 
/*      */   
/* 1143 */   public static final int SO_TYPE = 0;
/*      */ 
/*      */   
/* 1146 */   public static final int STDERR_FILENO = 0;
/*      */ 
/*      */   
/* 1149 */   public static final int STDIN_FILENO = 0;
/*      */ 
/*      */   
/* 1152 */   public static final int STDOUT_FILENO = 0;
/*      */ 
/*      */   
/* 1155 */   public static final int ST_MANDLOCK = 0;
/*      */ 
/*      */   
/* 1158 */   public static final int ST_NOATIME = 0;
/*      */ 
/*      */   
/* 1161 */   public static final int ST_NODEV = 0;
/*      */ 
/*      */   
/* 1164 */   public static final int ST_NODIRATIME = 0;
/*      */ 
/*      */   
/* 1167 */   public static final int ST_NOEXEC = 0;
/*      */ 
/*      */   
/* 1170 */   public static final int ST_NOSUID = 0;
/*      */ 
/*      */   
/* 1173 */   public static final int ST_RDONLY = 0;
/*      */ 
/*      */   
/* 1176 */   public static final int ST_RELATIME = 0;
/*      */ 
/*      */   
/* 1179 */   public static final int ST_SYNCHRONOUS = 0;
/*      */ 
/*      */   
/* 1182 */   public static final int S_IFBLK = 0;
/*      */ 
/*      */   
/* 1185 */   public static final int S_IFCHR = 0;
/*      */ 
/*      */   
/* 1188 */   public static final int S_IFDIR = 0;
/*      */ 
/*      */   
/* 1191 */   public static final int S_IFIFO = 0;
/*      */ 
/*      */   
/* 1194 */   public static final int S_IFLNK = 0;
/*      */ 
/*      */   
/* 1197 */   public static final int S_IFMT = 0;
/*      */ 
/*      */   
/* 1200 */   public static final int S_IFREG = 0;
/*      */ 
/*      */   
/* 1203 */   public static final int S_IFSOCK = 0;
/*      */ 
/*      */   
/* 1206 */   public static final int S_IRGRP = 0;
/*      */ 
/*      */   
/* 1209 */   public static final int S_IROTH = 0;
/*      */ 
/*      */   
/* 1212 */   public static final int S_IRUSR = 0;
/*      */ 
/*      */   
/* 1215 */   public static final int S_IRWXG = 0;
/*      */ 
/*      */   
/* 1218 */   public static final int S_IRWXO = 0;
/*      */ 
/*      */   
/* 1221 */   public static final int S_IRWXU = 0;
/*      */ 
/*      */   
/* 1224 */   public static final int S_ISGID = 0;
/*      */ 
/*      */   
/* 1227 */   public static final int S_ISUID = 0;
/*      */ 
/*      */   
/* 1230 */   public static final int S_ISVTX = 0;
/*      */ 
/*      */   
/* 1233 */   public static final int S_IWGRP = 0;
/*      */ 
/*      */   
/* 1236 */   public static final int S_IWOTH = 0;
/*      */ 
/*      */   
/* 1239 */   public static final int S_IWUSR = 0;
/*      */ 
/*      */   
/* 1242 */   public static final int S_IXGRP = 0;
/*      */ 
/*      */   
/* 1245 */   public static final int S_IXOTH = 0;
/*      */ 
/*      */   
/* 1248 */   public static final int S_IXUSR = 0;
/*      */ 
/*      */   
/* 1251 */   public static final int TCP_NODELAY = 0;
/*      */ 
/*      */   
/* 1254 */   public static final int TCP_USER_TIMEOUT = 0;
/*      */ 
/*      */   
/* 1257 */   public static final int WCONTINUED = 0;
/*      */ 
/*      */   
/* 1260 */   public static final int WEXITED = 0;
/*      */ 
/*      */   
/* 1263 */   public static final int WNOHANG = 0;
/*      */ 
/*      */   
/* 1266 */   public static final int WNOWAIT = 0;
/*      */ 
/*      */   
/* 1269 */   public static final int WSTOPPED = 0;
/*      */ 
/*      */   
/* 1272 */   public static final int WUNTRACED = 0;
/*      */ 
/*      */   
/* 1275 */   public static final int W_OK = 0;
/*      */ 
/*      */   
/* 1278 */   public static final int X_OK = 0;
/*      */ 
/*      */   
/* 1281 */   public static final int _SC_2_CHAR_TERM = 0;
/*      */ 
/*      */   
/* 1284 */   public static final int _SC_2_C_BIND = 0;
/*      */ 
/*      */   
/* 1287 */   public static final int _SC_2_C_DEV = 0;
/*      */ 
/*      */   
/* 1290 */   public static final int _SC_2_C_VERSION = 0;
/*      */ 
/*      */   
/* 1293 */   public static final int _SC_2_FORT_DEV = 0;
/*      */ 
/*      */   
/* 1296 */   public static final int _SC_2_FORT_RUN = 0;
/*      */ 
/*      */   
/* 1299 */   public static final int _SC_2_LOCALEDEF = 0;
/*      */ 
/*      */   
/* 1302 */   public static final int _SC_2_SW_DEV = 0;
/*      */ 
/*      */   
/* 1305 */   public static final int _SC_2_UPE = 0;
/*      */ 
/*      */   
/* 1308 */   public static final int _SC_2_VERSION = 0;
/*      */ 
/*      */   
/* 1311 */   public static final int _SC_AIO_LISTIO_MAX = 0;
/*      */ 
/*      */   
/* 1314 */   public static final int _SC_AIO_MAX = 0;
/*      */ 
/*      */   
/* 1317 */   public static final int _SC_AIO_PRIO_DELTA_MAX = 0;
/*      */ 
/*      */   
/* 1320 */   public static final int _SC_ARG_MAX = 0;
/*      */ 
/*      */   
/* 1323 */   public static final int _SC_ASYNCHRONOUS_IO = 0;
/*      */ 
/*      */   
/* 1326 */   public static final int _SC_ATEXIT_MAX = 0;
/*      */ 
/*      */   
/* 1329 */   public static final int _SC_AVPHYS_PAGES = 0;
/*      */ 
/*      */   
/* 1332 */   public static final int _SC_BC_BASE_MAX = 0;
/*      */ 
/*      */   
/* 1335 */   public static final int _SC_BC_DIM_MAX = 0;
/*      */ 
/*      */   
/* 1338 */   public static final int _SC_BC_SCALE_MAX = 0;
/*      */ 
/*      */   
/* 1341 */   public static final int _SC_BC_STRING_MAX = 0;
/*      */ 
/*      */   
/* 1344 */   public static final int _SC_CHILD_MAX = 0;
/*      */ 
/*      */   
/* 1347 */   public static final int _SC_CLK_TCK = 0;
/*      */ 
/*      */   
/* 1350 */   public static final int _SC_COLL_WEIGHTS_MAX = 0;
/*      */ 
/*      */   
/* 1353 */   public static final int _SC_DELAYTIMER_MAX = 0;
/*      */ 
/*      */   
/* 1356 */   public static final int _SC_EXPR_NEST_MAX = 0;
/*      */ 
/*      */   
/* 1359 */   public static final int _SC_FSYNC = 0;
/*      */ 
/*      */   
/* 1362 */   public static final int _SC_GETGR_R_SIZE_MAX = 0;
/*      */ 
/*      */   
/* 1365 */   public static final int _SC_GETPW_R_SIZE_MAX = 0;
/*      */ 
/*      */   
/* 1368 */   public static final int _SC_IOV_MAX = 0;
/*      */ 
/*      */   
/* 1371 */   public static final int _SC_JOB_CONTROL = 0;
/*      */ 
/*      */   
/* 1374 */   public static final int _SC_LINE_MAX = 0;
/*      */ 
/*      */   
/* 1377 */   public static final int _SC_LOGIN_NAME_MAX = 0;
/*      */ 
/*      */   
/* 1380 */   public static final int _SC_MAPPED_FILES = 0;
/*      */ 
/*      */   
/* 1383 */   public static final int _SC_MEMLOCK = 0;
/*      */ 
/*      */   
/* 1386 */   public static final int _SC_MEMLOCK_RANGE = 0;
/*      */ 
/*      */   
/* 1389 */   public static final int _SC_MEMORY_PROTECTION = 0;
/*      */ 
/*      */   
/* 1392 */   public static final int _SC_MESSAGE_PASSING = 0;
/*      */ 
/*      */   
/* 1395 */   public static final int _SC_MQ_OPEN_MAX = 0;
/*      */ 
/*      */   
/* 1398 */   public static final int _SC_MQ_PRIO_MAX = 0;
/*      */ 
/*      */   
/* 1401 */   public static final int _SC_NGROUPS_MAX = 0;
/*      */ 
/*      */   
/* 1404 */   public static final int _SC_NPROCESSORS_CONF = 0;
/*      */ 
/*      */   
/* 1407 */   public static final int _SC_NPROCESSORS_ONLN = 0;
/*      */ 
/*      */   
/* 1410 */   public static final int _SC_OPEN_MAX = 0;
/*      */ 
/*      */   
/* 1413 */   public static final int _SC_PAGESIZE = 0;
/*      */ 
/*      */   
/* 1416 */   public static final int _SC_PAGE_SIZE = 0;
/*      */ 
/*      */   
/* 1419 */   public static final int _SC_PASS_MAX = 0;
/*      */ 
/*      */   
/* 1422 */   public static final int _SC_PHYS_PAGES = 0;
/*      */ 
/*      */   
/* 1425 */   public static final int _SC_PRIORITIZED_IO = 0;
/*      */ 
/*      */   
/* 1428 */   public static final int _SC_PRIORITY_SCHEDULING = 0;
/*      */ 
/*      */   
/* 1431 */   public static final int _SC_REALTIME_SIGNALS = 0;
/*      */ 
/*      */   
/* 1434 */   public static final int _SC_RE_DUP_MAX = 0;
/*      */ 
/*      */   
/* 1437 */   public static final int _SC_RTSIG_MAX = 0;
/*      */ 
/*      */   
/* 1440 */   public static final int _SC_SAVED_IDS = 0;
/*      */ 
/*      */   
/* 1443 */   public static final int _SC_SEMAPHORES = 0;
/*      */ 
/*      */   
/* 1446 */   public static final int _SC_SEM_NSEMS_MAX = 0;
/*      */ 
/*      */   
/* 1449 */   public static final int _SC_SEM_VALUE_MAX = 0;
/*      */ 
/*      */   
/* 1452 */   public static final int _SC_SHARED_MEMORY_OBJECTS = 0;
/*      */ 
/*      */   
/* 1455 */   public static final int _SC_SIGQUEUE_MAX = 0;
/*      */ 
/*      */   
/* 1458 */   public static final int _SC_STREAM_MAX = 0;
/*      */ 
/*      */   
/* 1461 */   public static final int _SC_SYNCHRONIZED_IO = 0;
/*      */ 
/*      */   
/* 1464 */   public static final int _SC_THREADS = 0;
/*      */ 
/*      */   
/* 1467 */   public static final int _SC_THREAD_ATTR_STACKADDR = 0;
/*      */ 
/*      */   
/* 1470 */   public static final int _SC_THREAD_ATTR_STACKSIZE = 0;
/*      */ 
/*      */   
/* 1473 */   public static final int _SC_THREAD_DESTRUCTOR_ITERATIONS = 0;
/*      */ 
/*      */   
/* 1476 */   public static final int _SC_THREAD_KEYS_MAX = 0;
/*      */ 
/*      */   
/* 1479 */   public static final int _SC_THREAD_PRIORITY_SCHEDULING = 0;
/*      */ 
/*      */   
/* 1482 */   public static final int _SC_THREAD_PRIO_INHERIT = 0;
/*      */ 
/*      */   
/* 1485 */   public static final int _SC_THREAD_PRIO_PROTECT = 0;
/*      */ 
/*      */   
/* 1488 */   public static final int _SC_THREAD_SAFE_FUNCTIONS = 0;
/*      */ 
/*      */   
/* 1491 */   public static final int _SC_THREAD_STACK_MIN = 0;
/*      */ 
/*      */   
/* 1494 */   public static final int _SC_THREAD_THREADS_MAX = 0;
/*      */ 
/*      */   
/* 1497 */   public static final int _SC_TIMERS = 0;
/*      */ 
/*      */   
/* 1500 */   public static final int _SC_TIMER_MAX = 0;
/*      */ 
/*      */   
/* 1503 */   public static final int _SC_TTY_NAME_MAX = 0;
/*      */ 
/*      */   
/* 1506 */   public static final int _SC_TZNAME_MAX = 0;
/*      */ 
/*      */   
/* 1509 */   public static final int _SC_VERSION = 0;
/*      */ 
/*      */   
/* 1512 */   public static final int _SC_XBS5_ILP32_OFF32 = 0;
/*      */ 
/*      */   
/* 1515 */   public static final int _SC_XBS5_ILP32_OFFBIG = 0;
/*      */ 
/*      */   
/* 1518 */   public static final int _SC_XBS5_LP64_OFF64 = 0;
/*      */ 
/*      */   
/* 1521 */   public static final int _SC_XBS5_LPBIG_OFFBIG = 0;
/*      */ 
/*      */   
/* 1524 */   public static final int _SC_XOPEN_CRYPT = 0;
/*      */ 
/*      */   
/* 1527 */   public static final int _SC_XOPEN_ENH_I18N = 0;
/*      */ 
/*      */   
/* 1530 */   public static final int _SC_XOPEN_LEGACY = 0;
/*      */ 
/*      */   
/* 1533 */   public static final int _SC_XOPEN_REALTIME = 0;
/*      */ 
/*      */   
/* 1536 */   public static final int _SC_XOPEN_REALTIME_THREADS = 0;
/*      */ 
/*      */   
/* 1539 */   public static final int _SC_XOPEN_SHM = 0;
/*      */ 
/*      */   
/* 1542 */   public static final int _SC_XOPEN_UNIX = 0;
/*      */ 
/*      */   
/* 1545 */   public static final int _SC_XOPEN_VERSION = 0;
/*      */ 
/*      */   
/* 1548 */   public static final int _SC_XOPEN_XCU_VERSION = 0;
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\system\OsConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */