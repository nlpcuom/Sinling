 p a c k a g e   h e l a b a s a . n o u n s ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B K n o w l e d g e B a s e ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B T r a n s f o r m R u l e S e t ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
  
 p u b l i c   c l a s s   H B N o u n S y n t h e s i z e r   {  
  
 	 p u b l i c   H B N o u n S y n t h e s i z e r ( )   {  
  
 	 }  
  
 	 p u b l i c   s t a t i c   L i s t < H B N o u n >   S y n t h e s i z e N o u n s ( S t r i n g   s L e m m a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o ,   i n t   i R u l e S e t I D )  
 	 {  
 	 	 r e t u r n   S y n t h e s i z e N o u n s ( n e w   H B W o r d ( s L e m m a ) ,   o R u l e s ,   o J o i n S c o r e A l g o ,   i R u l e S e t I D ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B N o u n   S y n t h e s i z e N o u n ( S t r i n g   s L e m m a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o ,   i n t   i R u l e S e t I D )  
 	 {  
 	 	 r e t u r n   S y n t h e s i z e N o u n ( n e w   H B W o r d ( s L e m m a ) ,   o R u l e s ,   o N o u n S c o r e A l g o ,   o J o i n S c o r e A l g o ,   i R u l e S e t I D ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B N o u n   S y n t h e s i z e N o u n ( S t r i n g   s L e m m a ,   H B T r a n s f o r m R u l e S e t   o R u l e ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o )  
 	 {  
 	 	 r e t u r n   S y n t h e s i z e N o u n ( n e w   H B W o r d ( s L e m m a ) ,   o R u l e ,   o J o i n S c o r e A l g o ) ;  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   L i s t < H B N o u n >   S y n t h e s i z e N o u n s ( H B W o r d   o L e m m a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o ,   i n t   i R u l e S e t I D )  
 	 {  
 	 	 L i s t < H B N o u n >   l i s t N o u n s   =   n e w   A r r a y L i s t < H B N o u n > ( ) ;  
 	 	 L i s t < H B T r a n s f o r m R u l e S e t >   l i s t R u l e s   =   o R u l e s . G e t R u l e S e t L i s t ( ) ;  
 	 	  
 	 	 i f ( i R u l e S e t I D   < =   0 )  
 	 	 {  
 	 	 	 i R u l e S e t I D   =   H B K n o w l e d g e B a s e . G e t M o r p h R u l e I D ( o L e m m a . G e t N a t u r a l F o r m ( ) ,   H B P O S . P O S _ N O U N ,   ( s h o r t ) 0 ) ;  
 	 	 }  
 	 	 	 	  
 	 	 i n t   i C o u n t   =   l i s t R u l e s . s i z e ( ) ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : B E G I N   :   R u l e C o u n t = "   +   i C o u n t   +   "   :   L e m m a = "   +   o L e m m a . G e t N a t u r a l F o r m ( ) ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   l i s t R u l e s . g e t ( i ) ;  
 	 	 	  
 	 	 	 i f ( i R u l e S e t I D < = 0   | |   o R u l e S e t . G e t I D ( ) = = i R u l e S e t I D )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : R u l e S e t : B E G I N   :   R u l e S e t I D = "   +   o R u l e S e t . G e t I D ( )   +   "   :   R u l e S e t N a m e = "   +   o R u l e S e t . G e t N a m e ( ) ) ;  
 	 	 	 	 H B N o u n   o N o u n   =   S y n t h e s i z e N o u n ( o L e m m a ,   o R u l e S e t ,   o J o i n S c o r e A l g o ) ;  
 	 	 	 	 / / o N o u n . G e n e r a t e D e r i v e d F o r m s ( o J o i n S c o r e A l g o ,   o R u l e s . G e t D e r i v e d F o r m R u l e s ( ) ) ;  
 	 	 	 	 o N o u n . G e n e r a t e D e r i v e d F o r m s ( o J o i n S c o r e A l g o ,   o R u l e s ) ;  
 	 	 	 	 o N o u n . G e n e r a t e F i x e d D e r i v e d F o r m s ( o R u l e s . G e t B i G r a m R u l e s ( ) ) ;  
 	 	 	 	 l i s t N o u n s . a d d ( o N o u n ) ;  
 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : R u l e S e t : E N D   :   R u l e S e t I D = "   +   o R u l e S e t . G e t I D ( )   +   "   :   R u l e S e t N a m e = "   +   o R u l e S e t . G e t N a m e ( ) ) ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : E N D   :   R u l e C o u n t = "   +   i C o u n t   +   "   :   L e m m a = "   +   o L e m m a . G e t N a t u r a l F o r m ( ) ) ;  
 	 	  
 	 	 r e t u r n   l i s t N o u n s ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B N o u n   S y n t h e s i z e N o u n ( H B W o r d   o L e m m a ,   H B T r a n s f o r m R u l e S e t   o R u l e ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o )  
 	 {  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : G e n e r a t e F o r m s : B E G I N   :   R u l e I D = "   +   o R u l e . G e t I D ( )   +   "   :   R u l e N a m e = "   +   o R u l e . G e t N a m e ( )   +   "   :   L e m m a = "   +   o L e m m a . G e t N a t u r a l F o r m ( ) ) ;  
 	 	  
 	 	 H B N o u n   o N o u n   =   n e w   H B N o u n ( ) ;  
 	 	 o N o u n . S e t L e m m a ( o L e m m a ) ;  
 	 	 o N o u n . S e t R u l e S e t ( o R u l e ) ; 	 	 	  
 	 	 o N o u n . G e n e r a t e F o r m s ( o J o i n S c o r e A l g o ) ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " S y n t h e s i z e N o u n : G e n e r a t e F o r m s : E N D   :   R u l e I D = "   +   o R u l e . G e t I D ( )   +   "   :   R u l e N a m e = "   +   o R u l e . G e t N a m e ( )   +   "   :   L e m m a = "   +   o L e m m a . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 r e t u r n   o N o u n ;  
 	 } 	  
 	  
 	 p u b l i c   s t a t i c   H B N o u n   S y n t h e s i z e N o u n ( H B W o r d   o L e m m a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o ,   i n t   i R u l e S e t I D )  
 	 {  
 	 	 L i s t < H B N o u n >   l i s t N o u n s   =   S y n t h e s i z e N o u n s ( o L e m m a ,   o R u l e s ,   o J o i n S c o r e A l g o ,   i R u l e S e t I D ) ;  
  
 	 	 i n t   i C o u n t   =   l i s t N o u n s . s i z e ( ) ;  
 	 	 l o n g   l M a x S c o r e   =   0 ;  
 	 	 H B N o u n   o R e s u l t   =   n u l l ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B N o u n   o N o u n   =   l i s t N o u n s . g e t ( i ) ;  
 	 	 	 o N o u n S c o r e A l g o . E v a l u a t e ( o N o u n ) ;  
 	 	 	 l o n g   l S c o r e   =   o N o u n . G e t S c o r e ( ) ;    
 	 	 	 i f ( l S c o r e   >   l M a x S c o r e )  
 	 	 	 {  
 	 	 	 	 l M a x S c o r e   =   l S c o r e ;  
 	 	 	 	 o R e s u l t   =   o N o u n ;  
 	 	 	 } 	 	 	  
 	 	 	 / / o N o u n . P r i n t S u m m a r y ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   o R e s u l t ;  
 	 } 	  
 	  
 	  
 }  
