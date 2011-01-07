(ns script.run
  (:use otjni.core
        [clj-native.direct :only [defclib loadlib]]))


(defn -main [& args]
  (System/setProperty "jna.library.path" "jni")
  (loadlib otapi-lib)
  (println (OT_API_Init "data_folder")) ; "~/projects/Open-Transactions/testwallet/data_folder"
  (println (OT_API_LoadWallet "wallet.xml"))
  (println (OT_API_GetServer_Name (OT_API_GetServer_ID 0)))
  (println (OT_API_GetAccountCount)))
