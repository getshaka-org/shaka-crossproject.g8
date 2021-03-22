import org.getshaka.nativeconverter.NativeConverter

object DtoConverters:
  given NativeConverter[User] = NativeConverter.derived
