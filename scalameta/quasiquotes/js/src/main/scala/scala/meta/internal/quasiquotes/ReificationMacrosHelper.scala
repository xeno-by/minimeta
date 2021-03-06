package scala.meta
package internal
package quasiquotes

import scala.reflect.internal.util.SourceFile
import scala.meta.inputs.Input

object ReificationMacrosHelper {

  def reflectInputResult(reflectInput: SourceFile): Input =
    Input.String(new String(reflectInput.content)) // NOTE: can happen in REPL or in custom Global

}
