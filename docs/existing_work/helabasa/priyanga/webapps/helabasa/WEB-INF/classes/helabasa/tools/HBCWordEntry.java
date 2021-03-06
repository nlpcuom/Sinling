 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s ;  
  
 p u b l i c   c l a s s   H B C W o r d E n t r y   {  
  
 	 p r i v a t e   s t a t i c   l o n g 	 l _ I D   =   0 ;  
 	 p r i v a t e   l o n g   	 l _ W o r d I D   =   0 ;  
 	 p r i v a t e   S t r i n g   	 s _ W o r d   =   " " ;  
 	 p r i v a t e   l o n g 	 l _ F r e q u e n c y   =   0 ;  
 	 p r i v a t e   c h a r 	 c _ S t a t u s   =   0 ;  
 	  
 	 p u b l i c   s t a t i c   f i n a l   c h a r   H B C _ S T A T U S _ E X I S T I N G   =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   c h a r   H B C _ S T A T U S _ N E W 	 	   =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   c h a r   H B C _ S T A T U S _ U P D A T E D     =   2 ;  
 	  
 	 p u b l i c   H B C W o r d E n t r y ( l o n g   l W o r d I D ,   S t r i n g   s W o r d ,   l o n g   l F r e q )    
 	 {  
 	 	 l _ W o r d I D   =   l W o r d I D ;  
 	 	 s _ W o r d   =   s W o r d ;  
 	 	 l _ F r e q u e n c y   =   l F r e q ;  
 	 	 i f ( l _ I D   < =   l _ W o r d I D )  
 	 	 {  
 	 	 	 l _ I D   =   l _ W o r d I D   +   1 ;  
 	 	 }  
 	 	 c _ S t a t u s   =   H B C _ S T A T U S _ E X I S T I N G ;  
 	 }  
 	  
 	 p u b l i c   H B C W o r d E n t r y ( S t r i n g   s W o r d ,   l o n g   l F r e q )    
 	 {  
 	 	 l _ W o r d I D   =   l _ I D + + ;  
 	 	 s _ W o r d   =   s W o r d ;  
 	 	 l _ F r e q u e n c y   =   0 ; 	  
 	 	 c _ S t a t u s   =   H B C _ S T A T U S _ N E W ;  
 	 }  
  
  
 	 p u b l i c   v o i d   A d d O c c u r a n c e ( l o n g   l F r e q )  
 	 {  
 	 	 l _ F r e q u e n c y   + =   l F r e q ;  
 	 	 i f ( c _ S t a t u s   ! =   H B C _ S T A T U S _ N E W )  
 	 	 {  
 	 	 	 c _ S t a t u s   =   H B C _ S T A T U S _ U P D A T E D ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t I D ( )   {   r e t u r n   l _ W o r d I D ;   }  
 	 p u b l i c   l o n g   G e t F r e q u e n c y ( )   {   r e t u r n   l _ F r e q u e n c y ;   }  
 	 p u b l i c   c h a r   G e t S t a t u s ( )   {   r e t u r n   c _ S t a t u s ;   }  
 	 p u b l i c   S t r i n g   G e t W o r d ( )   {   r e t u r n   s _ W o r d ;   }  
 }  
