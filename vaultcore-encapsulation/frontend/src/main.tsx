import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { QueryClientProvider } from '@tanstack/react-query'
import { Toaster } from 'react-hot-toast'
import { queryClient } from './lib/queryClient'
import App from './App'
import './index.css'

createRoot(document.getElementById('root')!).render(
    <StrictMode>
        <QueryClientProvider client={queryClient}>
            <App />
            <Toaster
                position="top-right"
                toastOptions={{
                    style: {
                        background: '#151c2c',
                        color: '#eef1f6',
                        border: '1px solid #2a3348',
                        fontFamily: 'Inter, sans-serif',
                        fontSize: '14px',
                    },
                }}
            />
        </QueryClientProvider>
    </StrictMode>,
)