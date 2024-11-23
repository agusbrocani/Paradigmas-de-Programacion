-- Que hace :: en Haskell?
-- Es el operador de declaración de tipo.
-- Permite especificar el tipo de una función, valor o expresión.

-- NO TIENE NADA QUE VER CON EL NAMESPACE

sumar :: Int -> Int -> Int
-- nombreFuncion ::(operador para especificar firma) primerParametro -> segundoParametro -> tercerParametro -> ... -> NParametro -> tipoDeRetorno

sumar x y = x + y

-- el main es una funcion mas[ SIEMPRE DE TIPO IO]
-- IO es un tipo parametrizado, lo que significa que necesita un argumento de tipo para ser completamente especificado
-- tipo parametrizado: es un tipo que puede funcionar con diferentes tipos de datos dependiendo la entrada
-- tipo parametrizado EQUIVALENTE a GENERICO
main :: IO ()
-- TODA accion que quiera realizar en el MAIN debe declararse con main = [ASGIAN UNA ACCION A FUNCION MAIN]
main = print (sumar 10 15)