 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   h e l a b a s a . H B A n a l y z e r ;  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B F o r m C o n t a i n e r ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . N o u n C o n j u g a t o r ;  
  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B T e s t e r   {  
  
 	 p u b l i c   H B T e s t e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   s t a t i c   v o i d   A n a l y z e N o u n ( S t r i n g   s V a l )  
 	 {  
 	 	 N o u n C o n j u g a t o r   o N C   =   n e w   N o u n C o n j u g a t o r ( ) ;  
 	 	 P r i n t W r i t e r   o P W   =   n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ;  
 	 	 o N C . P r i n t R e s u l t s T a b l e ( o P W ,   s V a l ,   0 ) ;  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   v o i d   A n a l y z e ( S t r i n g   s W o r d )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " A n a l y z i n g   :   "   +   s W o r d   +   " \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 H B A n a l y z e r   o A n a l y z e r   =   n e w   H B A n a l y z e r ( ) ;  
 	 	 L i s t < H B P O S >   l s t R e s u l t s   =   n e w   A r r a y L i s t < H B P O S > ( ) ;  
 	 	 o A n a l y z e r . A n a l y z e ( s W o r d ,   l s t R e s u l t s ) ; 	 	  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < l s t R e s u l t s . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H B P O S   o P o s   =   l s t R e s u l t s . g e t ( i ) ;  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - \ r " ) ;  
 	 	 	 o P o s . D e b u g P r i n t ( ) ;  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - \ r " ) ;  
 	 	 }  
 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   D i s j o i n ( S t r i n g   s W o r d ,   S t r i n g   s S u f f i x )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " D i s j o i n i n g   :   "   +   s W o r d   +   "   f r o m   "   +   s S u f f i x   +   " \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
  
 	 	 L i s t < S t r i n g >   l s t R e s u l t s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 H B W o r d J o i n e r . D i s j o i n ( s W o r d ,   s S u f f i x ,     l s t R e s u l t s ,   f a l s e ,   0 ,   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ) ; 	  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < l s t R e s u l t s . s i z e ( ) ;   i + + )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( ( i + 1 )   +   "   :   "   +   l s t R e s u l t s . g e t ( i )   +   "   +   "   +   s S u f f i x   +   "   =   "   +   s W o r d   +   " \ r " ) ;  
 	 	 	  
 	 	 }  
 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   v o i d   J o i n ( S t r i n g   s L e f t ,   S t r i n g   s R i g h t )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " J o i n i n g   :   "   +   s L e f t   +   "   a n d   "   +   s R i g h t ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = \ r " ) ;  
 	 	  
         	 / / H B W o r d J o i n e r   o J o i n e r   =   n e w   H B W o r d J o i n e r ( ) ;  
  
 / *         	 f o r ( i n t   i = H B W o r d J o i n R u l e . P O O R W A _ S W A R A _ L O P A ;   i < = H B W o r d J o i n R u l e . D V I T H W A _ R O O P A   +   1 ;   i + + )  
 	 	 {  
         	 	 H B J o i n R e s u l t s S e t   r e s u l t s   =     H B W o r d J o i n e r . J o i n ( s L e f t ,   s R i g h t ,   i ,   t r u e ,   1 ,   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ) ;  
                 	 i n t   i C o u n t   =   r e s u l t s . G e t R e s u l t s C o u n t ( ) ;  
  
         	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i ]     + "   :   " ) ;  
         	  
         	 	 f o r ( i n t   j = 0 ;   j < i C o u n t ;   j + + )  
         	 	 {  
         	 	 	 i f ( j = = i C o u n t - 1 )  
         	 	 	 {  
         	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( r e s u l t s . G e t R e s u l t s A t ( i ) . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   +   "   ( "   +   r e s u l t s . G e t R e s u l t s A t ( i ) . G e t R e s u l t ( ) . G e t F r e q u e n c y ( )   +   " ) \ n \ r " ) ;  
         	 	 	 }  
         	 	 	 e l s e  
         	 	 	 {  
         	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( r e s u l t s . G e t R e s u l t s A t ( i ) . G e t R e s u l t ( ) . G e t N a t u r a l F o r m ( )   +   "   ( "   +   r e s u l t s . G e t R e s u l t s A t ( i ) . G e t R e s u l t ( ) . G e t F r e q u e n c y ( )   +   " ) ,   " ) ;  
         	 	 	 }  
         	 	 }  
 	 	 }     * /  
         	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   v o i d   T e s t F o r m C o n t a i n e r ( )  
 	 {  
 	 	 H B F o r m C o n t a i n e r   o F o r m s   =   n e w   H B F o r m C o n t a i n e r ( ) ;  
 	 	 H B F o r m   o F 0 0   =   n e w   H B I r r e g u l a r F o r m ( " 0 0 " ,   ( s h o r t ) 0 ,   ( s h o r t ) 0 ) ;  
 	 	 H B F o r m   o F 0 1   =   n e w   H B I r r e g u l a r F o r m ( " 0 1 " ,   ( s h o r t ) 0 ,   ( s h o r t ) 1 ) ;  
 	 	 H B F o r m   o F 0 2   =   n e w   H B I r r e g u l a r F o r m ( " 0 2 " ,   ( s h o r t ) 0 ,   ( s h o r t ) 2 ) ;  
 	 	 H B F o r m   o F 1 0   =   n e w   H B I r r e g u l a r F o r m ( " 1 0 " ,   ( s h o r t ) 1 ,   ( s h o r t ) 0 ) ;  
 	 	 H B F o r m   o F 1 1   =   n e w   H B I r r e g u l a r F o r m ( " 1 1 " ,   ( s h o r t ) 1 ,   ( s h o r t ) 1 ) ;  
 	 	 H B F o r m   o F 1 2   =   n e w   H B I r r e g u l a r F o r m ( " 1 2 " ,   ( s h o r t ) 1 ,   ( s h o r t ) 2 ) ; 	 	  
 	 	  
 	 	 o F o r m s . A d d F o r m ( 0 ,     0 ,   o F 0 0 ) ;  
 	 	 o F o r m s . A d d F o r m ( 0 ,     1 ,   o F 0 1 ) ;  
 	 	 o F o r m s . A d d F o r m ( 0 ,     2 ,   o F 0 2 ) ;  
 	 	  
 	 	 o F o r m s . A d d F o r m ( 1 ,     0 ,   o F 1 0 ) ;  
 	 	 o F o r m s . A d d F o r m ( 1 ,     1 ,   o F 1 1 ) ;  
 	 	 o F o r m s . A d d F o r m ( 1 ,     2 ,   o F 1 2 ) ; 	  
 	 	  
 	 	 L i s t < H B F o r m >   l s t   =   o F o r m s . G e t F o r m s ( 0 ,   0 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 l s t   =   o F o r m s . G e t F o r m s ( 0 ,   1 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 l s t   =   o F o r m s . G e t F o r m s ( 0 ,   2 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
  
 	 	 l s t   =   o F o r m s . G e t F o r m s ( 1 ,   0 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 l s t   =   o F o r m s . G e t F o r m s ( 1 ,   1 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 l s t   =   o F o r m s . G e t F o r m s ( 1 ,   2 ) ;  
 	 	 l s t . g e t ( 0 ) . D e b u g P r i n t ( ) ;  
 	 	  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )    
 	 {  
 	 	 S y s t e m . o u t . p r i n t l n ( " S t a r t i n g   T e s t   . . . " ) ;  
 	 	  
 	 	 / / H B C o r p u s . b _ O f f l i n e   =   t r u e ;  
 	 	 H e l a b a s a . I n i t ( ) ;  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	  
 	 	 / / T e s t F o r m C o n t a i n e r ( ) ;  
 	 	  
 	 	 / / A n a l y z e ( "������ " ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = =   T E S T   1   = = = = = = = = = = = = = = = = = = = " ) ; 	 	  
 	 	 H B W o r d   w o r d   =   n e w   H B W o r d ( "������ " ) ;  
 	 	 l o n g   l F r e q   =   H B C o r p u s . G e t W o r d F r e q u e n c y ( w o r d ) ; 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " f ( "   +   w o r d . G e t N a t u r a l F o r m ( )   +   " ) = "     +   l F r e q ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = =   T E S T   2   = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 L i s t < H B W o r d >   w o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	  
 / * 	 	 H B W o r d   w o r d 1   =   n e w   H B W o r d ( "������ " ) ;  
 	 	 H B W o r d   w o r d 2   =   n e w   H B W o r d ( "�������� " ) ;  
 	 	 H B W o r d   w o r d 3   =   n e w   H B W o r d ( "�������� " ) ; * /  
 	 	  
 	 	 w o r d L i s t . a d d ( w o r d ) ;  
 	 	 / / w o r d L i s t . a d d ( w o r d 1 ) ;  
 	 	 / / w o r d L i s t . a d d ( w o r d 2 ) ;  
 	 	 / / w o r d L i s t . a d d ( w o r d 3 ) ;  
 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( w o r d L i s t ) ; 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " f ( l i s t < "   +   w o r d . G e t N a t u r a l F o r m ( )   +   " > ) = "     +   w o r d . G e t F r e q u e n c y ( ) ) ;  
 	 	  
 	 	 / / A n a l y z e ( "������ " ) ;  
 	 	 / / A n a l y z e ( "�������� " ) ;  
 	 	  
 	 	 / / A n a l y z e ( "�������� " ) ;  
 	 	  
 	 	 / / A n a l y z e ( "����� " ) ;  
 	 	  
 	 	 / / A n a l y z e ( "������ " ) ;  
 	 	 / / A n a l y z e N o u n ( "������ " ) ;  
 	 	 	 	  
 	 	  
 	 	 / / D i s j o i n ( "������� " ,     "� " ) ;  
 	 	 / / D i s j o i n ( "�������� " ,     "��� " ) ;  
 	 	  
 	 	 / / A n a l y z e ( "������ " ) ;  
 	 	  
 	 	 / / J o i n ( "������ " ,   "� " ) ;  
 	 	  
 / / 	 	 S a n d h i   s   =   n e w   S a n d h i ( ) ;  
 / / 	 	 P r i n t W r i t e r   o u t   =   n e w   P r i n t W r i t e r ( S y s t e m . o u t ) ;  
 / / 	 	 s . P r i n t R e s u l t s T a b l e ( o u t ,   "��� " ,   "� " ,   " 1 " ) ;  
 / / 	 	 o u t . f l u s h ( ) ;  
 	 }  
  
 }  
