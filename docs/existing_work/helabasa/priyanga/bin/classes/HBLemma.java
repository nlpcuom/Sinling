 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B L e m m a   {  
  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   L E M M A _ T Y P E _ N O U N   =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   L E M M A _ T Y P E _ V E R B   =   2 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   L E M M A _ T Y P E _ P R E P O S I T I O N   =   3 ;  
 	  
 	 p r i v a t e   H B W o r d   	 o _ W o r d   =   n u l l ;  
 	 p r i v a t e   l o n g   	 i _ I D   =   0 ;  
 	 p r i v a t e   s h o r t   	 i _ T y p e   =   - 1 ;  
 	 p r i v a t e   s h o r t   	 i _ S u b T y p e   =   - 1 ;  
 	 p r i v a t e   s h o r t   	 i _ M o r p h R u l e I D   =   - 1 ;  
 	  
 	 p r i v a t e   L i s t < H B I r r e g u l a r F o r m >   l i s t _ E x c e p t i o n s   =   n u l l ;  
 	  
 	 p u b l i c   H B L e m m a ( l o n g   i I D ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e ,   S t r i n g   s L e m m a )    
 	 {  
 	 	 i I D   =   i _ I D ;  
 	 	 o _ W o r d   =   n e w   H B W o r d ( s L e m m a ) ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
  
 	 p u b l i c   H B L e m m a ( l o n g   i I D ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e ,   H B W o r d   o L e m m a )    
 	 {  
 	 	 i I D   =   i _ I D ;  
 	 	 o _ W o r d   =   o L e m m a . C l o n e ( ) ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t M o r p h R u l e I D ( s h o r t   i M o r p h R u l e I D )  
 	 {  
 	 	 i _ M o r p h R u l e I D   =   i M o r p h R u l e I D ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t M o r p h R u l e I D ( )  
 	 {  
 	 	 r e t u r n   i _ M o r p h R u l e I D ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t E x c e p t i o n s ( L i s t < H B I r r e g u l a r F o r m >   l i s t E x c e p t i o n s )  
 	 {  
 	 	 l i s t _ E x c e p t i o n s   =   l i s t E x c e p t i o n s ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d E x c e p t i o n ( s h o r t   i F o r m T y p e ,   s h o r t   i F o r m S u b T y p e ,   S t r i n g   s F o r m )  
 	 { 	 	  
 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n e w   H B I r r e g u l a r F o r m ( s F o r m ,   i F o r m T y p e ,   i F o r m S u b T y p e ) ;  
 	 	 A d d E x c e p t i o n ( o F o r m ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d E x c e p t i o n ( H B I r r e g u l a r F o r m   o F o r m )  
 	 {  
 	 	 i f ( l i s t _ E x c e p t i o n s = = n u l l )  
 	 	 {  
 	 	 	 l i s t _ E x c e p t i o n s   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	 	 }  
 	 	 l i s t _ E x c e p t i o n s . a d d ( o F o r m ) ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t E x c e p t i o n C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ E x c e p t i o n s . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   H B I r r e g u l a r F o r m   G e t E x c e p t i o n A t ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t _ E x c e p t i o n s . g e t ( i P o s ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 H e l a b a s a . o _ L o g . p r i n t l n ( " L e m m a   :   "   +   o _ W o r d . G e t N a t u r a l F o r m ( )   +   " ,   I D = "   +   i _ I D   +   " ,   T y p e = "   +   i _ T y p e   +   " ,   S u b T y p e = "   +   i _ S u b T y p e   +   " ,   M o r p h R u l e = "   +   i _ M o r p h R u l e I D ) ;  
 	 	 i n t   i C o u n t   =   G e t E x c e p t i o n C o u n t ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H e l a b a s a . o _ L o g . p r i n t l n ( " E x c e p t i o n [ "   +   i   +   " ]   :   " ) ;  
 	 	 	 G e t E x c e p t i o n A t ( i ) . D e b u g P r i n t ( ) ;  
 	 	 }  
 	 }  
 }  
