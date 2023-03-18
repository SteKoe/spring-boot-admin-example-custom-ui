import vue from "@vitejs/plugin-vue";
import path from "path";
import { defineConfig } from "vite";
import { viteStaticCopy } from "vite-plugin-static-copy";

export default defineConfig({
  plugins: [
    vue(),
    viteStaticCopy({
      targets: [
        {
          src: "src/main/custom-ui/routes.txt",
          dest: ".",
        },
      ],
    }),
  ],
  build: {
    target: "es2015",
    sourcemap: true,
    minify: false,
    outDir: "build/resources/main/META-INF/spring-boot-admin-server-ui/extensions/custom-ui/",
    lib: {
      entry: path.resolve(__dirname, "src/main/custom-ui/index.js"),
      name: "CustomUi",
      formats: ["umd"],
      fileName: () => "custom-ui.js",
    },
    define: {
      __VUE_PROD_DEVTOOLS__: process.env.NODE_ENV === "development",
    },
    rollupOptions: {
      external: ["vue"],
      output: {
        globals: {
          vue: "Vue",
        },
      },
    },
  },
});
