 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . u t i l s . H B N u t r a l P r i n t W r i t e r ;  
  
  
 p u b l i c   c l a s s   H B N o u n T e s t e r   {  
  
 	 p u b l i c   H B N o u n T e s t e r ( )   {  
  
 	 }  
  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   B e g i n   T e s t   :   H B N o u n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 	  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 H e l a b a s a . S e t D e b u g L o g ( n e w   H B N u t r a l P r i n t W r i t e r ( ) ) ;  
 	 	 / / H e l a b a s a . S e t D e b u g L o g ( H e l a b a s a . G e t L o g ( ) ) ;  
 	 	  
 	 	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
 	 	  
 	 	 L i s t < H B N o u n >   l i s t N o u n s   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n s ( "������ " ,   o R u l e s ,   o J o i n S c o r e A l g o ,   0 ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t N o u n s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = [ "   +   i   +   " ] = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 H B N o u n   o N o u n   =   l i s t N o u n s . g e t ( i ) ; 	  
 	 	 	 o N o u n . D e b u g P r i n t ( ) ;  
 	 	 }  
 	 	  
 	 	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ; 	 	  
 	 	 H B N o u n   o B e s t N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( "������ " ,   o R u l e s ,   o N o u n S c o r e A l g o ,   o J o i n S c o r e A l g o ,   0 ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = [ B e s t ] = = = = = = = = = = = = = = = = = = = = = " ) ; 	 	  
 	 	 o B e s t N o u n . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = =   E n d   T e s t   :   H B N o u n T e s t e r   = = = = = = = = = = = = = = = " ) ;  
 	 }  
  
 }  
